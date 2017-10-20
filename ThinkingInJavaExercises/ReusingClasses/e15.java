import reuse.e15.A;

class e15{ 
    public static void main(String[] args){ 
        //main program here... 
        A a = new A();
        //! a.doSomething(); // protected方法对包外以及非子类屏蔽
        B b = new B();
    }
}

class B extends A{
    B(){
        System.out.print("in B's Constructor:");
        super.doSomething();
    }
}
