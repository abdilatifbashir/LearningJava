import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class e16{
    public static void main(String[] args){
        //main program here...
        Scanner scanner = new Scanner(new CharProducer());
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}

class CharProducer implements Readable{
    private int count = 5;
    private static final char[] cList="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
    private Random random = new Random();
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count--==0)return -1;
        for(int i=0;i<10;i++)
            cb.append(cList[random.nextInt(cList.length)]);
        cb.append(" ");
        return 11;
    }
}