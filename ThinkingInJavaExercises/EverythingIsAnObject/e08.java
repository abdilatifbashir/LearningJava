class e08{ 
public static void main(String[] args){ 
        StaticFieldClass a = new StaticFieldClass();
        StaticFieldClass b = new StaticFieldClass();
        a.i=1;
        b.i=2;
        System.out.println("a.i:"+a.i+";b.i:"+b.i);
    }
}

class StaticFieldClass{
    static int i=0;
}
