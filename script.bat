@echo off

javac MathUtil.Java

Java MathUtil

New-Item -Path . -Name " manifest.mf" -ItemType "file" -Value "Main-class: MathUtil" //PowerShell
pause

echo Main-class: MathUtil file > manifest.mf //cmd
pause

jar -cmvf manifest.mf .\MathUtil.jar *.class

java -jar .\MathUtil.jar
pause

exit