package accesstest.e05;

public class e05A{
    public int a=5;
    private int b=10;
    int c=15;
    public int getb(){
        return b;
    }
    public void say(){
        System.out.println("call private say() and protected say2()");
        say1();
        say2();
    }
    private void say1(){
        System.out.println("private say method");
    }
    protected void say2(){
        System.out.println("protected say2 method");
    }
}