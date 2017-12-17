class e15{
    public static void main(String[] args){
        //main program here...
        Student student = CreateStudent("Wang",2);
        student.print();
    }
    public static Student CreateStudent(String name,int grade){
        return new Student(name,grade){
            public void print(){
                System.out.println("Student name:"+this.name+",Student grade:"+this.grade);
            }
        };
    }
}

class Student{
    String name;
    int grade;

    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }

    public void print(){
    }
}