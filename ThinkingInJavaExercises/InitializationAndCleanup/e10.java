class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        new aClass();
        //we create the object,drop its reference and let it be
        //If the program cost too much memory,the gc will find the obj and try to release the memory of it
        //the gc will call the finalize() method and release the memory
    }
}

class aClass{
    protected void finalize(){
        System.out.println("aObject finalize");
    }
}
