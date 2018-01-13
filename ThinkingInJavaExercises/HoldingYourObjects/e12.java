import java.util.*;

class e12 {
    public static void main(String args[]) {
        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            ints.add(random.nextInt(100));
        }
        List<Integer> ints2 = new ArrayList<>();
        ListIterator<Integer> iterator = ints.listIterator(ints.size());//According to Java Api,
        // "An initial call to previous would return the element with the specified index minus one"
        while(iterator.hasPrevious()){
            System.out.println(iterator.previousIndex());
            ints2.add(iterator.previous());
        }
        System.out.println(ints);
        System.out.println(ints2);
    }
}