class e0506{ 
    public static void main(String[] args){ 
        //main program here...
        Dog dog1 = new Dog();
        dog1.name="spot";dog1.says="Ruff!";
        Dog dog2 = new Dog();
        dog2.name="scruffy";dog2.says="Wurf!";
        System.out.println(dog1.name+" say:"+dog1.says);
        System.out.println(dog2.name+" say:"+dog2.says);
        Dog dog3 = new Dog();
        dog3 = dog1;
        System.out.println(dog1==dog3);
        System.out.println(dog1.equals(dog3));
    }
}

class Dog{
    String name;
    String says;
}
