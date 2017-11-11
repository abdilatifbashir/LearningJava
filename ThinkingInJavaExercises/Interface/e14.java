class e14{
    public static void main(String[] args){
        //main program here...
        mClass cls = new mClass();
        CallFirst(cls);
        CallSecond(cls);
        CallThird(cls);
        CallCombined(cls);
    }
    private static void CallFirst(FirstInterface f){
        f.A();
        f.B();
    }
    private static void CallSecond(SecondInterface f){
        f.C();
        f.D();
    }
    private static void CallThird(ThirdInterface f){
        f.E();
        f.F();
    }
    private static void CallCombined(CombinedInterface f){
        f.G();
    }
}
interface FirstInterface{
    void A();
    void B();
}
interface SecondInterface{
    void C();
    void D();
}
interface ThirdInterface{
    void E();
    void F();
}

interface CombinedInterface extends FirstInterface,SecondInterface,ThirdInterface{
    void G();
}

class BaseClass{
    public void H(){
        System.out.println("H");
    }
}

class mClass extends BaseClass implements CombinedInterface{
    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }

    @Override
    public void D() {
        System.out.println("D");
    }

    @Override
    public void E() {
        System.out.println("E");
    }

    @Override
    public void F() {
        System.out.println("F");
    }

    @Override
    public void G() {
        System.out.println("G");
    }
}