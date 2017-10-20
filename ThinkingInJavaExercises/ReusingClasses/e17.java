class e17{ 
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
        a.say(s);//尽管a是Amphibian类的对象（向上造型），但是a.say调用的仍是Frog类的say方法
    }
}

class Frog extends Amphibian{
    @Override
    void say(String s){
        super.say(s);
        System.out.println("Frog's override method");
    }
}
