class e18{ 
    public static void main(String[] args){ 
        //main program here... 
        e18Cls[] arr=new e18Cls[20]; //constructor won't run
        for(int i=0;i<arr.length;i++)
        arr[i]=new e18Cls("abc");
    }
}

class e18Cls{
    e18Cls(String s){
        System.out.println(s);
    }
}

