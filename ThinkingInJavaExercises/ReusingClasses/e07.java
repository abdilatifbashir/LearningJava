class e07{ 
    public static void main(String[] args){ 
        //main program here... 
        C c = new C("abc");
    }
}

class A{
    A(String s){
        System.out.println("A's constructor:"+s);
    }
}

class B extends A{
    B(String s){
        super(s);
        System.out.println("B's constructor:"+s);
    }
}

class C extends B{
    C(String s){
        super(s);
        System.out.println("C's constructor:"+s);
    }
}
