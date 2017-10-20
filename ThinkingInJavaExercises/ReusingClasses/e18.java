import java.util.*;

class e18{ 
    public static void main(String[] args){ 
        //main program here... 
        FinalTest a = new FinalTest();
        FinalTest b = new FinalTest();
        System.out.println(a);
        System.out.println(b);
    }
}

class FinalTest{
    static Random ran = new Random();
    static final int a = ran.nextInt();//all the object's a are the same
    final int b = ran.nextInt();
    public String toString(){
        return "a:"+a+" b:"+b;
    }
}