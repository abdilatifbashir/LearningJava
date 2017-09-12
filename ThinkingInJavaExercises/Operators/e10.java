class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        char a=0xf0;
        char b=0x1f;
        System.out.println("a="+Integer.toBinaryString(a));
        System.out.println("b="+Integer.toBinaryString(b));
        System.out.println("a & b="+Integer.toBinaryString(a&b));//AND
        System.out.println("a | b="+Integer.toBinaryString(a|b));//OR
        System.out.println("a ^ b="+Integer.toBinaryString(a^b));//XOR
        System.out.println("~a="+Integer.toBinaryString(~a));//NOT
        System.out.println("~b="+Integer.toBinaryString(~b));

    }
}
