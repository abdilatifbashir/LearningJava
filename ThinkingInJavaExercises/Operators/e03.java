class e03{ 
    public static void main(String[] args){ 
       //main program here... 
       FloatNum f=new FloatNum();
       f.num=1.0f;
       System.out.println("1 f.num:"+f.num);
       PassObj(f);
       System.out.println("2 f.num:"+f.num);
    }

    public static void PassObj(FloatNum f){
        f.num=5.5f;//Aliasing during method calls
    }

}

class FloatNum{
    float num;
}
