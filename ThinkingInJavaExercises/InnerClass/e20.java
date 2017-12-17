class e20 implements A{ 
    public static void main(String[] args){ 
        //main program here... 
        B b = new B();
        System.out.println(b.getNum());
    }
}

interface A{
    class B{
        int num=1;
        int getNum(){
            return num;
        }
    }
}