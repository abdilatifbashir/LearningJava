class e01{ 
    public static void main(String[] args){ 
        //main program here... 
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        Rider.rideCycle(u);
        Rider.rideCycle(b);
        Rider.rideCycle(t);
    }
}

class Cycle{
    public void ride(){
        System.out.println("Cycle.ride()");
    }
}

class Unicycle extends Cycle{
    public void ride(){
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle extends Cycle{
    public void ride(){
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle{
    public void ride(){
        System.out.println("Tricycle.ride()");
    }
}

class Rider{
    public static void rideCycle(Cycle i){
        i.ride();
    }
}