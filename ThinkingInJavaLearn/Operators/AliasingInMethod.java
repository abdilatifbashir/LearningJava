class AliasingInMethod{ 
    public static void main(String[] args){ 
       //main program here... 
        Letter x=new Letter();
        x.c='a';
        System.out.println("1: x.c:"+x.c);
        f(x);
        System.out.println("2: x.c:"+x.c);   
    }

    static void f(Letter y)
    {
        y.c='z';
    }
}

class Letter {
    char c;
}