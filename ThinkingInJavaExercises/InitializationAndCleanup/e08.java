class e08{ 
    public static void main(String[] args){ 
        //main program here... 
        OneClass cls = new OneClass();
        cls.Method1();
    }
}

class OneClass{
    void Method1(){
        Method2();
        this.Method2();
    }
    void Method2(){
        System.out.println("call Method2.");
    }
}
