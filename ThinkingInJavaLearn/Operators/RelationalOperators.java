class RelationalOperators{ 
    public static void main(String[] args){ 
       //main program here... 
       Integer n1=new Integer(47);
       Integer n2=new Integer(47);
       //the == & != operators compare the references,not the exact value of the integer!
       System.out.println(n1==n2);//false
       System.out.println(n1!=n2);//true
       //you should use equals() instead of ==
       System.out.println(n1.equals(n2));
       System.out.println("***************************");
       SthToCompare c1=new SthToCompare();
       SthToCompare c2=new SthToCompare();
       System.out.println(c1.equals(c2));
    }
}
 
class SthToCompare{
    int i;    
    //you should override the equals() method or it will simply compare the references
}
