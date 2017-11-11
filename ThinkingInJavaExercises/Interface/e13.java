class e13{
    public static void main(String[] args){
        //main program here...
        E e = new E();
        e.doSth();
    }
}

interface A{
    void doSth();
}
interface B extends A{
    void doSth();

}
interface C extends A{
    void doSth();
}
interface D extends B,C{
    void doSth();
}
class E implements D{
    public void doSth(){
        System.out.println("Combined interface doSth");
    }
}