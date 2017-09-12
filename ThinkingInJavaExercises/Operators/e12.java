class e12{ 
    public static void main(String[] args){ 
        //main program here... 
        int a=-1;
        System.out.println(Integer.toBinaryString(a));
        a=a<<1;
        for(int i=0;i<31;i++)
        {
            a=a>>>1;//unsigned right shift operator
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
