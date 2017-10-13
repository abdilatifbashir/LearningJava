package accesstest.e08;

public class ConnectionManager{
    private static Connection[] list={new Connection(),new Connection(),new Connection(),new Connection(),new Connection()};
    private static int count=0;
    public static Connection startConnection(){
        if(count<list.length){
            count++;
            return list[count-1];
        }
        else return null;
    }
}

class Connection{
    Connection(){
        System.out.println("new Connection!");
    }
}