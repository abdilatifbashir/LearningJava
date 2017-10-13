import java.util.Vector;
//! import accesstest.mypackage.Vector; //will cause collision

class e02{ 
    public static void main(String[] args){ 
        //main program here... 
        Vector vector1 = new Vector();
        accesstest.mypackage.Vector vector2 = new accesstest.mypackage.Vector();
        vector2.Say();
    }
}
