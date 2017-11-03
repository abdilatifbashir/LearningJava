class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        Base b = new Inherited();
        b.aMethod();//Because aMethod isn't overrided, it just 
        //keep the same as the base class's method
    }
}

class Base{
    public void aMethod(){
        bMethod();
    }
    public void bMethod(){

    }
}

class Inherited extends Base{
    @Override
    public void bMethod(){
        System.out.println("inherited class");
    }
}
