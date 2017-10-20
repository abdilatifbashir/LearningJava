class e13{ 
    public static void main(String[] args){ 
        //main program here... 
        B b = new B();
        b.doThings();
        b.doThings(1);
        b.doThings(1.4f);
        b.doThings("ABC");
    }
}

class A{
    void doThings(){System.out.println("do()");}
    void doThings(int a){System.out.println("do(int a)");}
    void doThings(String b){System.out.println("do(String b)");}
}

class B extends A{
    void doThings(float c){System.out.println("do(float c)");}
}