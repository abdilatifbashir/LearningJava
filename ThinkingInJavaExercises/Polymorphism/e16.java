class e16{ 
    public static void main(String[] args){ 
        //main program here... 
        Starship starship = new Starship();
        starship.report();
        starship.attack();
        starship.report();
        starship.attack();
        starship.report();
    }
}

class Starship{
    AlertState alertState = new AlertState();
    public void report(){
        alertState.getAlertState().alert();
    }
    public void attack(){
        alertState.change();
    }
}

class Alert{
    public void alert(){}
}

class Safe extends Alert{
    public void alert(){System.out.println("Safe");}
}

class Damaged extends Alert{
    public void alert(){System.out.println("Damaged");}
}

class Broken extends Alert{
    public void alert(){System.out.println("Broken");}
}

class AlertState{
    int i=0;
    public Alert getAlertState(){
        switch (i){
            case 0:return new Safe();
            case 1:return new Damaged();
            case 2:return new Broken();
            default:return null;
        }
    }
    public void change(){
        if(i<2)i++;
    }
}