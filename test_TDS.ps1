[console]::BackgroundColor = "black"
Clear-Host

# installation d'une module de couleur si nécessaire

if (Get-Module -ListAvailable -Name PSWriteColor) {
    Write-Output "Module exists"
} else {
    Write-Output "Module does not exist"
    Install-Module -name PSWriteColor
}

Set-Location .\TDS\src


 #javac  ./parcours/*.java
javac  -cp ./antlr-3.5.2-complete.jar ./parserlexer/ExprLexer.java ./parserlexer/ExprParser.java ./parcours/*.java ./writefile/*.java ./decs/*.java ./excepts/*.java ./Test_TDS.java




$Files = get-childitem -name -r -File -Filter draft.tig

foreach ($File in $Files) 
 { 
   

     java  -cp .:antlr-3.5.2-complete.jar  Test_TDS $File  #2> sortie.txt

     if (($Null) -eq(Get-Content "sortie.txt")){
         write-Color -Text "[SUCCESS] " ,"-> $File" -Color Green,Blue

        

     }
     else{

         write-Color -Text "[ERROR] " ,"-> $File " -Color Red, blue
     }
 }

 Remove-Item *.class
 Remove-Item ./parcours/*.class
 Remove-Item ./decs/*.class
 Remove-Item ./writefile/*.class


 Set-Location ../..

 java -jar microPIUPK.jar -ass test_ASS.src 1> sortie_ASS.txt

 java -jar microPIUPK.jar -batch test_ASS.iup 

 

 read-host 'Touchez pour continuer !!!'