class e01{ 
    public static void main(String[] args){ 
        //main program here... 
        SecondClass.print_a();
    }
}

class SecondClass{
    static FirstClass cls;
    static void print_a(){
        if(cls==null)
            cls=new FirstClass();
        System.out.println(cls.a);
    }
}

class FirstClass{
    int a=6;
}