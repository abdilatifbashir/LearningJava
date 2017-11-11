import interfaces.e05.*;

class e05{ 
    public static void main(String[] args){ 
        //main program here... 
        Handler handler = new Handler();
        handler.method1();
        handler.method2();
        handler.method3();
    }
}

class Handler implements myInterface{
    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
    public void method3(){
        System.out.println("Method3");
    }
}
