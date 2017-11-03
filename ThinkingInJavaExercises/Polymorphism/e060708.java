import java.util.*;

class e060708{ 
    public static void main(String[] args){ 
        //main program here... 
        Music3.main(null);
    }
}

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT ;
}

class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    @Override public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}
class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}
class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}
class Typhoon extends Wind {
    void play(Note n) { System.out.println("Typhoon.play() " + n); }
    public String toString() { return "Typhoon"; }
}
class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[6];
        for(int i=0;i<6;i++){
            orchestra[i]=RandomInstrument();
        }
        tuneAll(orchestra);
        System.out.println(orchestra[0]);
    }

    public static Instrument RandomInstrument(){
        Random rand = new Random();
        switch(rand.nextInt(6)){
                default:
                case 0:return new Wind();
                case 1:return new Percussion();
                case 2:return new Stringed();
                case 3:return new Brass();
                case 4:return new Woodwind();
                case 5:return new Typhoon();
        }
    }
}