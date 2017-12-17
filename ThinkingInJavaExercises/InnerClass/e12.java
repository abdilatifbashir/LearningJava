class e12{
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
        Inner i = getInner();
        i.change();
    }
    Inner getInner(){
        return new Inner(){
            public void change(){
                a=3;
                say();
            }
        };
    }
}

class Inner{
    public void change(){}
}