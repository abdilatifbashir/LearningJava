class e05{ 
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
    public int wheels(){return 0;}
}

class Unicycle extends Cycle{
    public void ride(){
        System.out.print("Unicycle.ride() ");
        System.out.println("wheels:"+wheels());
    }
    @Override public int wheels(){
        return 1;
    }
}

class Bicycle extends Cycle{
    public void ride(){
        System.out.print("Bicycle.ride() ");
        System.out.println("wheels:"+wheels());
    }
    @Override public int wheels(){
        return 2;
    }
}

class Tricycle extends Cycle{
    public void ride(){
        System.out.print("Tricycle.ride() ");
        System.out.println("wheels:"+wheels());
    }
    @Override public int wheels(){
        return 3;
    }
}

class Rider{
    public static void rideCycle(Cycle i){
        i.ride();
    }
}