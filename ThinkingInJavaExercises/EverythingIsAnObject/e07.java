class e07{ 
public static void main(String[] args){ 
    StaticTest.i=0;
    Incrementable.increment();
	System.out.println(StaticTest.i);
    }
}

class StaticTest{
    static int i;
}

class Incrementable {
    static void increment() {
	    StaticTest.i++;
    }
}
