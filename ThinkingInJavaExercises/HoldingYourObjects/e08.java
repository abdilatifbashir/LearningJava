import java.util.ArrayList;
import java.util.Iterator;

class e08{
    public static void main(String[] args){
        //main program here...
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));
        gerbils.add(new Gerbil(5));
        Iterator<Gerbil> i = gerbils.iterator();
        while(i.hasNext()){
            Gerbil g = i.next();
            g.hop();
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