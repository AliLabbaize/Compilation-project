Set-Location .\test

Remove-Item  *.class
Remove-Item  src\*.class
Remove-Item  tds\*.class
Remove-Item  .\src\ExprLexer.java
Remove-Item .\src\ExprParser.java

Set-Location ..