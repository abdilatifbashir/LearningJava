import java.util.LinkedList;
import java.util.ListIterator;

class e14 {
    public static void main(String[] args) {
        //main program here...
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        for (int i = 1; i <= 10; i++) {
            it.add(i);
            if (i % 2 == 0)
                it.previous();
        }
        System.out.println(list);
    }
}