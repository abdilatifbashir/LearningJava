class e06{ 
    public static void main(String[] args){ 
        //main program here... 
        Dog dog = new Dog();
        dog.bark('s');
        dog.bark(10);
        dog.bark(20L,1);
        dog.bark(1,20L);
    }
}

class Dog{
    void bark(char vol){
        System.out.println("Dog's growling.");
    }
    void bark(int vol){
        System.out.println("Dog's barking.");
    }
    void bark(long vol,int a){
        System.out.println("Dog's howling.");
    }
    void bark(int a,long vol){
        System.out.println("Dog's yelping.");
    }
}
