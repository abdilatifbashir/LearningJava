class e16{ 
    public static void main(String[] args){ 
        //main program here... 
        Frog f = new Frog();
        Amphibian.sing(f,"abc");
    }
}

class Amphibian{
    void say(String s){
        System.out.println("Amphibian say:"+s);
    }
    static void sing(Amphibian a,String s){
        a.say(s);
    }
}

class Frog extends Amphibian{}
