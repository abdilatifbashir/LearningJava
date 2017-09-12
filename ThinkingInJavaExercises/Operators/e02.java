class e02{ 
    public static void main(String[] args){ 
       //main program here... 
       Tank a = new Tank();
       Tank b = new Tank();
       a.i=1.0f;
       b.i=2.0f;
       Print(1,a,b);
       a=b;
       Print(2,a,b);
       a.i=3.0f;
       Print(3,a,b);
    }

    static void Print(int i,Tank a,Tank b)
    {
        System.out.println(i+":"+" a.i:"+a.i+" b.i:"+b.i);
    }

}

class Tank
{
    float i;
}
