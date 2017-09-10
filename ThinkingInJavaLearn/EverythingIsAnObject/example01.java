import java.util.Date;

/**A class comment
 * @author thunderbird1997
 * @version 0.1
 */
public class example01 {

    /** A field comment */
    public int i;

    /**A method comment
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("hello,world!");
        System.out.println(new Date());
        System.getProperties().list(System.out);
    }

    /**
     * use HTML elements in javadoc:
     * <b>Bold Text here</b>
     * <ol>
     *     <li>list</li>
     *     <li>can</li>
     *     <li>also</li>
     *     <li>be</li>
     *     <li>added</li>
     * </ol>
     */
    public void Documentation1() {}
}
