class e12{ 
    public static void main(String[] args){ 
        //main program here... 
        Stem stem = new Stem();
        try{ 
            
        }finally{
            stem.c1.dispose();
            stem.c2.dispose();
            stem.c3.dispose();
            stem.dispose();  
        }
        
    }
}

class Component1{
    Component1(){
        System.out.println("Component1");
    }
    void dispose(){
       System.out.println("Component1 dispose"); 
    }
}

class Component2{
    Component2(){
        System.out.println("Component2");
    }
    void dispose(){
       System.out.println("Component2 dispose"); 
    }
}

class Component3{
    Component3(){
        System.out.println("Component3");
    }
    void dispose(){
       System.out.println("Component3 dispose"); 
    }
}

class Root{
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    Root(){
        System.out.println("Root");
    }
    void dispose(){
       System.out.println("Root dispose"); 
    }
}

class Stem extends Root{
    Stem(){
        System.out.println("Stem");
    }
    void dispose(){
        super.dispose();
        System.out.println("Stem dispose"); 
    }
}