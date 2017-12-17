class e03{ 
    public static void main(String[] args){ 
        //main program here... 
        Outer outer = new Outer("Outer");
        Outer.Inner inner = outer.getInner();
        System.out.println(inner);
    }
}

class Outer{
    private String s;
    public Outer(String str){
        s = str;
    }
    Inner getInner(){
        return new Inner();
    }
    class Inner{
        public String toString(){
            return s;
        }
        void introduce(){
            System.out.println("I'm an Inner Class.");
        }
    }
}
