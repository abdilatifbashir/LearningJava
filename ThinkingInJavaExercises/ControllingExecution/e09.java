class e09{ 
    public static void main(String[] args){ 
        //main program here... 
        int num=Integer.parseInt(args[0]);
        int a=1;
        int b=1;
        int tmp=0;
        if(num<=2)System.out.println("error!parameter must be greater than 3!");
        else
        {
            System.out.println(a);
            System.out.println(b);
            for(int i=0;i<num-2;i++)
            {
                System.out.println(a+b);
                tmp=a;a=b;b+=tmp;
            }
        }
    }
}
