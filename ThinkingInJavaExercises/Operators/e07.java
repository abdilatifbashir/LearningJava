import java.util.Random;

class e07{ 
    public static void main(String[] args){ 
        //main program here... 
        //a coin-flipping game
        Random random = new Random();
        boolean result = random.nextBoolean();
        if(result)System.out.println("Front side of the coin.");
        else System.out.println("Back side of the coin.");
    }
}
