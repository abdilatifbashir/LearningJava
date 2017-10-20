class e08{ 
    public static void main(String[] args){ 
        //main program here... 
        B b1 = new B();
        B b2 = new B("abc/");
    }
}

class A{
    A(String s){
        System.out.println("A:"+s);
    }
}

class B extends A{
    B(){
        super("no content.");
    }
    B(String s){
        super(s);
    }
}
