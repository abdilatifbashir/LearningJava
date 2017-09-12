class e11{ 
    public static void main(String[] args){ 
        //main program here... 
        int a = -0xff;
        System.out.println(Integer.toBinaryString(a));
        for(int i=0;i<7;i++)
        {
            a=a>>1;//signed right shift operator
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
