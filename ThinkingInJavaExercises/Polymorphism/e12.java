class e12{ 
    public static void main(String[] args){ 
        //main program here... 
        Rodent[] zoo = {
            new Mouse(),
            new Gerbil(),
            new Hamster(),
        };
        for(Rodent r:zoo){
            r.bite();
            r.molar();
        }
        for(Rodent r:zoo){
            r.dispose();
        }
    }
}

class Rodent{
    Rodent(){
        System.out.println("Rodent initialized.");
    }
    public void bite(){}
    public void molar(){}
    public void dispose(){
        System.out.println("Rodent disposed.");
    }
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse initialized.");
    }
    public void bite(){System.out.println("Mouse.bite()");}
    public void molar(){System.out.println("Mouse.molar()");}
    public void dispose(){
        System.out.println("Mouse disposed.");
        super.dispose();
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil initialized.");
    }
    public void bite(){System.out.println("Gerbil.bite()");}
    public void molar(){System.out.println("Gerbil.molar()");}
    public void dispose(){
        System.out.println("Gerbil disposed.");
        super.dispose();
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster initialized.");
    }
    public void bite(){System.out.println("Hamster.bite()");}
    public void molar(){System.out.println("Hamster.molar()");}
    public void dispose(){
        System.out.println("Hamster disposed.");
        super.dispose();
    }
}