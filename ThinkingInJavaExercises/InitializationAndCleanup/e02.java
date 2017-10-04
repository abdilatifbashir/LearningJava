class e02{ 
    public static void main(String[] args){ 
        //main program here... 
        StrClass1 str1 = new StrClass1();
        StrClass2 str2 = new StrClass2("String can be modified through constructor.");
        System.out.println("StrClass1:"+str1.s);
        System.out.println("StrClass2:"+str2.s);
    }
}

class StrClass1{
    String s="String is initialized at the point of definition.Cannot modify.";
}

class StrClass2{
    String s;
    StrClass2(String s){this.s=s;}
}
