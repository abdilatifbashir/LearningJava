package accesstest.e09.access.foreign;
import accesstest.e09.access.local.*;

public class Foreign {
    public static void main(String[] args) {
        PackagedClass pc = new PackagedClass();//提示错误：无法访问PackagedClass
    }
}