class e04{ 
    public static void main(String[] args){ 
        //main program here... 
        for(int i=3;i<100;i++)//print all the prime number between 3 and 100
        {
            boolean flag=false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)System.out.println(i);
        }
    }
}
