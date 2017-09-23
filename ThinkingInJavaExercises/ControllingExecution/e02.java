import java.util.Random;

class e02{ 
    public static void main(String[] args){ 
        //main program here... 
        Random rand = new Random();
        for(int i=0;i<25;i++)
        {
            int val=rand.nextInt();
            int comp=rand.nextInt();
            if(val<comp)
                System.out.println("value:"+val+" compare to:"+comp+"result:smaller");
            else if(val>comp)
                System.out.println("value:"+val+" compare to:"+comp+"result:greater");
            else
                System.out.println("value:"+val+" compare to:"+comp+"result:equal");  
        }
    }
}
