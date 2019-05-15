
# installation d'une module de couleur si nécessaire

if (Get-Module -ListAvailable -Name PSWriteColor) {
    Write-Output "Module exists"
} else {
    Write-Output "Module does not exist"
    Install-Module -name PSWriteColor
}

Copy-Item -Force .\Expr.g .\test\Expr.g

Set-Location .\test

Remove-Item  *.class
Remove-Item  src\*.class
Remove-Item  tds\*.class
Remove-Item  .\src\ExprLexer.java
Remove-Item .\src\ExprParser.java

# compilation de la grammaire

java -jar ..\antlr-3.5.2-complete.jar .\Expr.g


#New-Item -ItemType Directory -Path src -Force
Move-Item -Force .\ExprLexer.java .\src\ExprLexer.java 
Move-Item -Force .\ExprParser.java .\src\ExprParser.java

# On rajoute le package src au Lexer et au parser pour la classe de Test

$fileContent = Get-Content .\src\ExprLexer.java
$fileContent[2-1] += "package src;"
$fileContent | Set-Content .\src\ExprLexer.java

$fileContent = Get-Content .\src\ExprParser.java
$fileContent[2-1] += "package src;"
$fileContent | Set-Content .\src\ExprParser.java

#Compilation java pour 

javac  .\src\ExprLexer.java .\src\ExprParser.java
javac  .\tds\*.java
javac   -cp. .\Test.java

#Boucle de test pour chaque fichier .tiger disponible dans le dossier tds
#(Par default , seulement pour le fichier test.tiger avec option -Filter) 

$Files = get-childitem -name -r -File -Filter test.tiger
 foreach ($File in $Files) 
 { 
     java -cp . Test_TDS  $File 2> sortie.txt  1> sortie1.txt

     $MyLine = Get-Content sortie1.txt
     if (Get-Content sortie1.txt | Where-Object { $_.Contains("Exception") }){
        add-content sortie.txt $MyLine
     }

     if (($Null) -eq(Get-Content "sortie.txt")){
         write-Color -Text "[SUCCESS] " ,"-> $File" -Color Green,Blue

     }
     else{
         write-Color -Text "[ERROR] " ,"-> $File" -Color Red, blue
     }
 }

Remove-Item .\sortie.txt


 Set-Location ..
