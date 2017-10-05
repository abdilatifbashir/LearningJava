class e19{ 
    public static void main(String[] args){ 
        //main program here... 
        Print("abc","def","ghi");//Pass comma-seperated String
        Print(new String[]{"abc","def","ghi"});//Pass a String array
    }
    static void Print(String... list){
        for(String s:list)
        System.out.println(s);
    }
}
