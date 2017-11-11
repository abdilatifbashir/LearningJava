class e07{
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
    }
}

interface Rodent{
    void bite();
    void molar();
}

class Mouse implements Rodent{
    public void bite(){System.out.println("Mouse.bite()");}
    public void molar(){System.out.println("Mouse.molar()");}
}

class Gerbil implements Rodent{
    public void bite(){System.out.println("Gerbil.bite()");}
    public void molar(){System.out.println("Gerbil.molar()");}
}

class Hamster implements Rodent{
    public void bite(){System.out.println("Hamster.bite()");}
    public void molar(){System.out.println("Hamster.molar()");}
}