class e11{ 
    public static void main(String[] args){ 
        //main program here... 
        Detergent dt = new Detergent();
        dt.dilute();
        dt.apply();
        dt.scrub();
        dt.foam();
        System.out.println(dt.toString());
    }
}
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

class Detergent{
    private Cleanser cls = new Cleanser();

    public void append(String a) {
        cls.append(a);
    }

    public void dilute() {
        cls.dilute();
    }

    public void apply() {
        cls.apply();
    }

    public void scrub() {
        append(" Detergent.scrub()");
        cls.scrub();
    }

    public void foam() { append(" foam()"); }

    public String toString(){
        return cls.toString();
    }

}
