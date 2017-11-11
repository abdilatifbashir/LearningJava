class e04{
    public static void main(String[] args){
        //main program here...
        D(new B());
    }
    // 1
    /*
    static void D(A a){
        ((B)a).C();
    }
    */

    // 2
    static void D(A a){
        a.C();
    }
}

abstract class A{
    abstract void C();// 2
}

class B extends A{
    void C(){
        System.out.println("It works!");
    }
}