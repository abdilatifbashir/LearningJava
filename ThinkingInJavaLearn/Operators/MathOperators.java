import java.util.*;

class MathOperators{ 
    public static void main(String[] args){ 
        //main program here... 
        Random rand=new Random(47);//a seeded random number generator
        int i,j,k;
        //Choose value from 1 to 100
        j=rand.nextInt(100)+1;
        k=rand.nextInt(100)+1;
        print("j:"+j);
        print("k:"+k);
        i=j+k;
        print("j+k:"+i);
        i=j-k;
        print("j-k:"+i);
        i=k/j;
        print("k/j:"+i);
        i=k*j;
        print("k*j:"+i);
        i=k%j;
        print("k%j:"+i);

        //floating number
        float u,v,w;
        v=rand.nextFloat();
        print("v:"+v);
        w=rand.nextFloat();
        print("w:"+w);
        u=v+w;
        print("v+w:"+u);
        u=v-w;
        print("v-w:"+u);
        u=v*w;
        print("v*w:"+u);
        u=v/w;
        print("v/w:"+u);

        //following also works for char,byte,short,int,long,double;
        u+=v;
        print("u+=v:"+u);
        u-=v;
        print("u-=v:"+u);
        u*=v;
        print("u*=v:"+u);
        u/=v;
        print("u/=v:"+u);
    }

    public static void print(Object obj)
    {
        System.out.println(obj);
    }
}
