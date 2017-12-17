class e05{
    public static void main(String[] args){
        //main program here...
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
    }
}

class OuterClass{
    class InnerClass{}
}