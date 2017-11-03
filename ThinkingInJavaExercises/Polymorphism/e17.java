class e17{
    public static void main(String[] args){
        //main program here...
        Cycle[] cycleList = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
        //! cycleList[0].balance(); cannot find balance()
        //! cycleList[1].balance(); cannot find balance()
        ((Unicycle)cycleList[0]).balance();
        ((Bicycle)cycleList[1]).balance();
        ((Unicycle)cycleList[2]).balance(); //! throw ClassCastException
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
    public void balance(){
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle{
    public void ride(){
        System.out.println("Bicycle.ride()");
    }
    public void balance(){
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle{
    public void ride(){
        System.out.println("Tricycle.ride()");
    }
}