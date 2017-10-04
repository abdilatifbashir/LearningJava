class e04{ 
    public static void main(String[] args){ 
        //main program here... 
        ClassA a = new ClassA("Hello world!");
    }
}

class ClassA{
    ClassA(){
        System.out.println("Default constructor.");
    }
    ClassA(String s){
        this();
        System.out.println("Init Message:"+s);
    }
}
