class Assignment{ 
    public static void main(String[] args){ 
        //main program here... 
        Tank t1=new Tank();
        Tank t2=new Tank();
        t1.level=9;
        t2.level=42;
        Print(1,t1,t2);
        t1=t2;//this Assignment will make t1 and t2 hold the same reference, this is called 'Aliasing'(混淆)
        Print(2,t1,t2);
        t1.level=27;//as t1 & t2 hold the same reference,their .level will be changed to 27 together
        Print(3,t1,t2);
    }

    static void Print(int No,Tank t1,Tank t2)
    {
        System.out.println(No+":"+" t1.level:"+t1.level+" t2.level:"+t2.level);
    }
}

class Tank{
    int level;
}
