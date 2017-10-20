class e05{ 
    public static void main(String[] args){ 
        //main program here... 
        C c = new C();
    }
}

class A{
    A(){
        System.out.println("A's constructor");
    }
}

class B{
    B(){
        System.out.println("B's constructor");
    }
}

class C extends A{
    private B b=new B();
}