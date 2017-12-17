class e08{
    public static void main(String[] args){
        //main program here...
        A a = new A();
        a.say();
    }
}

class A{
    void say(){
        B b = new B();
        System.out.println(b.aint);
    }
    class B{
        private int aint=4;
    }
}