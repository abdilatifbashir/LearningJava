class e19{ 
    public static void main(String[] args){ 
        //main program here... 
        A a1 = new A();
        A a2 = new A("I'm James");
        a1.say();
        a2.say();
    }
}

class A{
    private final String words;
    A(){
        words="null";
    }
    A(String s){
        words=s;
    }
    public void say(){
        //! words=""; //错误，无法为final变量分配值
        System.out.println(words);
    }
}
