class e12{ 
    public static void main(String[] args){ 
        //main program here... 
        Tank a = new Tank();//hold the reference and empty the tank
        a.empty();
        Tank b = new Tank();//hold the reference and leave the tank filled
        new Tank();//drop the reference and leave the tank filled(Only this one will be collected by gc)
        System.gc();//Force gc
    }
}

class Tank{
    boolean status=true;
    void fill(){
        status=true;
    }
    void empty(){
        status=false;
    }
    protected void finalize(){
        if(status)System.out.println("Error:Tank not empty!");
    }
}