@echo off
shift

echo class %0{ >> %0.java
echo     public static void main(String[] args){ >> %0.java
echo         //main program here... >> %0.java
echo     }>> %0.java
echo }>> %0.java