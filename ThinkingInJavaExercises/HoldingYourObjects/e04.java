import java.util.*;

class e04{
    public static void main(String[] args){
        //main program here...
        String[] array = new String[]{generator.next(),generator.next(),generator.next()};
        List<String> arraylist = new ArrayList<String>();
        arraylist.add(generator.next());arraylist.add(generator.next());arraylist.add(generator.next());
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add(generator.next());linkedlist.add(generator.next());linkedlist.add(generator.next());
        HashSet<String> hashset = new HashSet<String>();
        hashset.add(generator.next());hashset.add(generator.next());hashset.add(generator.next());
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
        linkedhashset.add(generator.next());linkedhashset.add(generator.next());linkedhashset.add(generator.next());
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add(generator.next());treeset.add(generator.next());treeset.add(generator.next());
        System.out.println(Arrays.toString(array));
        System.out.println(arraylist);
        System.out.println(linkedlist);
        System.out.println(hashset);
        System.out.println(linkedhashset);
        System.out.println(treeset);
    }
}

class generator{
    private static String[] names = new String[]{"Neo","Morpheus","Agent Smith","Trinity","Niobe","Oracle",
    "Link","Persephone","The Merovingian","The Keymaker"};
    private static int i=0;
    public static String next(){
        if(i<names.length){
            i++;
            return names[i-1];
        }
        else{
            i=0;
            return names[i];
        }
    }
}