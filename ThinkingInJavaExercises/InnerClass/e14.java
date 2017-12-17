interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class e14 {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster(){
            public void menace() {System.out.println("anonymousDangerousMonster.menace");}
            public void destroy() {System.out.println("anonymousDangerousMonster.destroy");}
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire(){
            public void menace() {System.out.println("anonymousVampire.menace");}
            public void destroy() {System.out.println("anonymousVampire.destroy");}
            public void kill() {System.out.println("anonymousVampire.kill");}
            public void drinkBlood() {System.out.println("anonymousVampire.drinkBlood");}
        };
        u(vlad);
        v(vlad);
        w(vlad);

    }
}