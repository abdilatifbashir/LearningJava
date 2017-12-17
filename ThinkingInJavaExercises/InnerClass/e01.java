class e01{ 
    public static void main(String[] args){ 
        //main program here... 
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        inner.introduce();
    }
}

class Outer{
    Inner getInner(){
        return new Inner();
    }
    class Inner{
        void introduce(){
            System.out.println("I'm an Inner Class.");
        }
    }
}