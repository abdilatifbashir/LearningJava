class e14{ 
    public static void main(String[] args){ 
        //main program here... 
        StaticTest.Print();
    }
}
class StaticTest{
    static String str1="hello";
    static String str2;
    static{
        str2="world";
    }
    static void Print(){
        System.out.println("str1:"+str1+" str2:"+str2);
    }
}
