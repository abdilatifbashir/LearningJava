class e14{ 
    public static void main(String[] args){ 
        //main program here... 
        Mouse mouse =new Mouse();
        Rodent[] zoo = {
            new Gerbil(mouse),
            new Hamster(mouse),
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
        //System.out.println("Rodent initialized.");
    }
    public void bite(){}
    public void molar(){}
    public void dispose(){
        //System.out.println("Rodent disposed.");
    }
}

class Mouse extends Rodent{
    private static int refcount=0;
    Mouse(){
        System.out.println("Mouse initialized.");
    }

    public void addRef(){
        refcount++;
    }

    public void bite(){System.out.println("Mouse.bite()");}
    public void molar(){System.out.println("Mouse.molar()");}
    public void dispose(){
        if(--refcount==0){
            System.out.println("Mouse disposed.");
            super.dispose();    
        }
        
    }
}

class Gerbil extends Rodent{
    private Mouse mouse;
    Gerbil(Mouse mouse){
        this.mouse=mouse;
        mouse.addRef();
        System.out.println("Gerbil initialized.");
    }
    public void bite(){System.out.println("Gerbil.bite()");}
    public void molar(){System.out.println("Gerbil.molar()");}
    public void dispose(){
        System.out.println("Gerbil disposed.");
        mouse.dispose();
        super.dispose();
    }
}

class Hamster extends Rodent{
    private Mouse mouse;
    Hamster(Mouse mouse){
        this.mouse=mouse;
        mouse.addRef();
        System.out.println("Hamster initialized.");
    }
    public void bite(){System.out.println("Hamster.bite()");}
    public void molar(){System.out.println("Hamster.molar()");}
    public void dispose(){
        System.out.println("Hamster disposed.");
        mouse.dispose();
        super.dispose();
    }
}