import java.util.ArrayList;

class e01{ 
    public static void main(String[] args){ 
        //main program here... 
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));
        gerbils.add(new Gerbil(5));
        for(int i=0;i<5;i++){
            Gerbil gerbil = gerbils.get(i);
            gerbil.hop();
        }
    }
}

class Gerbil{
    int gerbilNumber;
    public Gerbil(int i){
        gerbilNumber = i;
    }
    void hop(){
        System.out.println("Gerbil "+gerbilNumber+" is hopping");
    }
}