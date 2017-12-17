import innerclasses.e11.*;

class e11{ 
    public static void main(String[] args){ 
        //main program here... 
        Test t = new Test();
        t.getA().say();
        //! ((Test.privateInnerClass)t.getA()).say();
    }
}

class Test{
    private class privateInnerClass implements aInterface{
        public void say(){
            System.out.println("abc");
        }
    }
    public aInterface getA(){
        return new privateInnerClass();
    }
}
