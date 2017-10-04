class e09{ 
    public static void main(String[] args){ 
        //main program here... 
        OneClass cls=new OneClass();
    }
}

class OneClass{
    OneClass(){
        this(1);
        System.out.println("call the first constructor.");
    }
    OneClass(int a){
         System.out.println("call the second constructor with an int "+a);
    }
}