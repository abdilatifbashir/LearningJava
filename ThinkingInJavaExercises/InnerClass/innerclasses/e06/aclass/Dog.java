package innerclasses.e06.aclass;

import innerclasses.e06.ainterface.*;

public class Dog{
    protected class Food implements Animal{
        private String What;
        public Food(String s){
            this.What = s;
        }
        public void eat(){
            System.out.println(What + " is eaten.");
        }
    }
    public void follow(){}
}