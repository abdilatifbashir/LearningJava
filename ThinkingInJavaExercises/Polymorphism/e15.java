class e15{ 
    public static void main(String[] args){ 
        //main program here... 
        PolyConstructors.main(null);
    }
}

class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int a = 1;
    private int b = 1;
    private int c = 1;
    RectangularGlyph(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("RectangularGlyph.RectangularGlyph(), a="+a+" b="+b+" c="+c);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), a="+a+" b="+b+" c="+c);
    }
}

class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(1,2,3);
    }
}