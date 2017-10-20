import java.util.*;

class e23{ 
    public static void main(String[] args){ 
        //main program here... 
        System.out.println(A.t);//load when accessing static members
        A a = new A();
        B b1 = new B(); //load when necessary
        B b2 = new B(); //won't reload
    }
}

class A{
    static Random rand=new Random(48);
    static int t = rand.nextInt();
    A(){
        System.out.println("A's t:"+t);
    }
}

class B{
    static int t = A.rand.nextInt();
    B(){
        System.out.println("B's t:"+t);
    }
}