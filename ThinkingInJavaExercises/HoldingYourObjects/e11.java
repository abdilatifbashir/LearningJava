import java.util.*;

class e11{
    public static void main(String[] args){
        //main program here...
        printStudentList(fill(new ArrayList<>()));
        printStudentList(fill(new LinkedList<>()));
        printStudentList(fill(new HashSet<>()));
        printStudentList(fill(new LinkedHashSet<>()));
    }
    private static void printStudentList(Collection<Student> c){
        Iterator<Student> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    private static Collection<Student> fill(Collection<Student> c){
        c.add(new Student("James"));
        c.add(new Student("Adam"));
        c.add(new Student("Judy"));
        c.add(new Student("Bob"));
        c.add(new Student("Lucy"));
        return c;
    }
}

class Student{
    private String name;
    public Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}