import accesstest.e08.ConnectionManager;

class e08{ 
    public static void main(String[] args){ 
        //main program here... 
        for(int i=0;i<10;i++){
            Object con = ConnectionManager.startConnection();
            System.out.println(con);
        }
        
    }
}
