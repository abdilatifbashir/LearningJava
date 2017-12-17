import innerclasses.e06.aclass.*;
import innerclasses.e06.ainterface.*;

class WildDog extends Dog{ 
    public Animal getAnimalFood(){
        return new Food("biscuits");
    }
}

class e06 extends Dog{ 
    public static void main(String[] args){ 
        //main program here...  
        WildDog wd = new WildDog();
        Animal a = wd.getAnimalFood();
        a.eat();
    }
}