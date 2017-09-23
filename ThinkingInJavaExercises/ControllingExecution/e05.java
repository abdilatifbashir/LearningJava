class e05{ 
    public static void main(String[] args){ 
        //main program here... 
        char a=0xf0;
        char b=0x1f;
        System.out.println("a="+getBinaryString(a));
        System.out.println("b="+getBinaryString(b));
        System.out.println("a & b="+getBinaryString(a&b));//AND
        System.out.println("a | b="+getBinaryString(a|b));//OR
        System.out.println("a ^ b="+getBinaryString(a^b));//XOR
        System.out.println("~a="+getBinaryString(~a));//NOT
        System.out.println("~b="+getBinaryString(~b));
    }

    public static String getBinaryString(int input)
    {
        String ret="";
        for(int i=0;i<8;i++)
        {
            if((input&0x80)==0)
                ret+="0";
            else
                ret+="1";
            input<<=1;
        }
        return ret;
    }
}
