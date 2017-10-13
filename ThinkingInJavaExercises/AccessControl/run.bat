@echo off

shift 

if exist .\%0.class del .\%0.class

echo Compiling java class...
javac %0.java

if exist .\%0.class echo Run! && shift && java %0 %1 %2 %3 %4 %5 %6 %7 %8 %9
pause