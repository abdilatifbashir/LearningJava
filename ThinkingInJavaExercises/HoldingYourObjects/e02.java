import java.util.*;

class e02{
    public static void main(String[] args) {
        //main program here...
        SimpleCollection.main(null);
    }
}

class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}
