class e03{
    public static void main(String[] args){
        //main program here...
        LaserPrinter p = new LaserPrinter();
        p.print();
    }
}

abstract class Printer{
    Printer(){
        print(); // at this time s isn't initialized,so the output is 0
    }
    abstract void print();
}

class LaserPrinter extends Printer{
    private int s = 10;
    @Override
    void print() {
        System.out.println(s);
    }
}