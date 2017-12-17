import innerclasses.e10.*;

class e10{ 
    public static void main(String[] args){ 
        //main program here... 
        A a = new A();
        a.ParcelReader(true).read();
    }
}

class A{
    public Label ParcelReader(boolean sw){
        if(sw){
            class Postman implements Label{
                public void read(){
                    System.out.println("Read the label.");
                }
            }    
            return new Postman();
        }else return null;
    } 
}