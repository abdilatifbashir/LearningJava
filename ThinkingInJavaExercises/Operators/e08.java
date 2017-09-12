class e08{ 
    public static void main(String[] args){ 
        //main program here... 
        long num1=0xffL;
        System.out.println(num1);
        long num2=0177L;
        System.out.println(num2);
        System.out.println("0xffL="+Long.toBinaryString(num1));
        System.out.println("0x177L="+Long.toBinaryString(num2));
    }
}
