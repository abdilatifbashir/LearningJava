import innerclasses.e09.*;

class e09{ 
    public static void main(String[] args){ 
        //main program here... 
        A a = new A();
        a.ParcelReader().read();
    }
}

class A{
    public Label ParcelReader(){
        class Postman implements Label{
            public void read(){
                System.out.println("Read the label.");
            }
        }
        return new Postman();
    } 
}
