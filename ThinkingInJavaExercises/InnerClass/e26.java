class e26{ 
    public static void main(String[] args){ 
        //main program here... 
        A a = new A();
        InheritB b = new InheritB(a,"abc");
    }
}

class A{
    class B{
        public B(String s){
            System.out.println(s);
        }
    }
}

class InheritB extends A.B{
    public InheritB(A a,String s){
        a.super(s);
    }
}