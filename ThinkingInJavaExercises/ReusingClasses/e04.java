class e04{ 
    public static void main(String[] args){ 
        //main program here... 
        B b = new B();
    }
}

class A{
    A(){
        System.out.println("A constructor!");
    }
}

class B extends A{
    B(){
        System.out.println("B constructor is called after A constructor!");
    }
}