[console]::BackgroundColor = "black"
Clear-Host
# installation d'une module de couleur si nécessaire

if (Get-Module -ListAvailable -Name PSWriteColor) {
    #Write-Output "Module exists"
} else {
    Write-Output "Module does not exist"
    Install-Module -name PSWriteColor
}

Copy-Item -Force .\Expr.g .\testcases\Expr.g

Set-Location .\testcases

Remove-Item  *.class
Remove-Item  src\*.class
Remove-Item  tds\*.class
Remove-Item  .\src\ExprLexer.java
Remove-Item .\src\ExprParser.java

# compilation de la grammaire

java -jar ..\antlr-3.5.2-complete.jar .\Expr.g

Write-Host "Compilation de Expr.g effectuee"


#New-Item -ItemType Directory -Path src -Force
Move-Item -Force .\ExprLexer.java ..\TDS\src\parserlexer\ExprLexer.java 
Move-Item -Force .\ExprParser.java ..\TDS\src\parserlexer\ExprParser.java

Set-Location ..\TDS

# On rajoute le package src au Lexer et au parser pour la classe de Test

$fileContent = Get-Content .\src\parserlexer\ExprLexer.java
$fileContent[2-1] += "package parserlexer;"
$fileContent | Set-Content .\src\parserlexer\ExprLexer.java 

$fileContent = Get-Content .\src\parserlexer\ExprParser.java
$fileContent[2-1] += "package parserlexer;"
$fileContent | Set-Content .\src\parserlexer\ExprParser.java

javac  -cp ./src/antlr-3.5.2-complete.jar .\src\parserlexer\ExprLexer.java .\src\parserlexer\ExprParser.java
javac   -cp ./src/antlr-3.5.2-complete.jar .\src\Test_compil.java

Write-Host "Lexer et Parser compiles"

$Files = get-childitem -name -r -File -Filter *.tig
 foreach ($File in $Files) 
 { 
     java -cp . Test_compil  $File 2> sortie.txt 1> sortie1.txt

     $MyLine = Get-Content sortie1.txt
     if ($MyLine | Where-Object { $_.Contains("Exception") }){
        add-content sortie.txt $MyLine
     }

     if (($Null) -eq(Get-Content "sortie.txt")){
         write-Color -Text "[SUCCESS] " ,"-> $File" -Color Green,Blue
        # Write-Host $MyLine
     }
     else{
         write-Color -Text "[ERROR] " ,"-> $File" -Color Red, blue
     }
 }

Remove-Item .\sortie.txt

Set-Location ..
Write-Host ""
Write-Host ""
Write-Host ""
read-host 'Touchez pour continuer !!!'