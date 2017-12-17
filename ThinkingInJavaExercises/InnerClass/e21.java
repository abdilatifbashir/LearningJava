class e21{ 
    public static void main(String[] args){ 
        //main program here... 
        A.B.show(new C());
    }
}

class C implements A{
    public int NumToDisplay(){
        return 5;
    }
}

interface A{
    int NumToDisplay();
    class B{
        static void show(A a){
            System.out.println(a.NumToDisplay());
        }
    }
}