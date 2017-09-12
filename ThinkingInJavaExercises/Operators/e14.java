class e14{ 
    public static void main(String[] args){ 
        //main program here... 
        Compare("a","b");
    }

    public static void Compare(String s1,String s2)
    {
        System.out.println("s1:"+s1+" s2:"+s2);
        System.out.println("s1+s2:"+s1+s2);
        //System.out.println("s1<s2:"+s1<s2);
        //System.out.println("s1>s2:"+s1>s2);
        //System.out.println("s1<s2:"+s1<s2);
        //System.out.println("s1>=s2:"+s1>=s2);
        //System.out.println("s1<=s2:"+s1<=s2);
        System.out.println("s1==s2:"+s1==s2);
        System.out.println("s1!=s2:"+s1!=s2);
        System.out.println("s1.equals(s2):"+s1.equals(s2));
    }
}
