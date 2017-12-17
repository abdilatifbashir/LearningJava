class e02{
    public static void main(String[] args){
        //main program here...
        Sequence.main(null);
    }
}

class Person{
    String name;

    @Override
    public String toString() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        sequence.add(new Person("Peter").toString());
        sequence.add(new Person("James").toString());
        sequence.add(new Person("Armstrong").toString());
        sequence.add(new Person("Williams").toString());
        sequence.add(new Person("Steve").toString());
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}