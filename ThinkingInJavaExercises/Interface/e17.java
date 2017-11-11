class e17 implements A{ 
    public static void main(String[] args){ 
        //main program here... 
        System.out.println(a);//can output a in a static method,so a is static
        //! a=20; we got an error as we can't assign value to final variables
    }
}

interface A{
    int a=10;
}