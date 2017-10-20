class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        Stem s = new Stem("E");
    }
}

class Component1{
    Component1(String s){
        System.out.println("Component1:"+s);
    }
}

class Component2{
    Component2(String s){
        System.out.println("Component2:"+s);
    }
}

class Component3{
    Component3(String s){
        System.out.println("Component3:"+s);
    }
}

class Root{
    Component1 c1 = new Component1("A");
    Component2 c2 = new Component2("B");
    Component3 c3 = new Component3("C");
    Root(String s){
        System.out.println("Root:"+s);
    }
}

class Stem extends Root{
    Stem(String s){
        super("D");
        System.out.println("Stem:"+s);
    }
}