class e15{ 
    public static void main(String[] args){ 
        //main program here... 
        InstanceInitTest a = new InstanceInitTest();
        System.out.println(a.str);
    }
}

class InstanceInitTest{
    String str;
    {
        str="abc";    
    }
}
