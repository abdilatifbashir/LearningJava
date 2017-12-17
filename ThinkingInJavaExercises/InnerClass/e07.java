class e07{
    public static void main(String[] args){
        //main program here...
        A a = new A();
        a.method();
    }
}

class A{
    private int a=2;
    private void say(){
        System.out.println(a);
    }
    void method(){
        Inner i = new Inner();
        i.change();
    }
    class Inner{
        public void change(){
            a=3;
            say();
        }
    }
}