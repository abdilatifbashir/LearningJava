import java.util.Stack;

class e15{
    public static void main(String[] args){
        //main program here...
        Stack<Character> sequence = new Stack<Character>();
        char[] expression="+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".toCharArray();
        int i=0;
        while(i<expression.length){
            if(expression[i]=='+'){
                sequence.push(expression[++i]);
                i++;
            }else if(expression[i]=='-'){
                System.out.print(sequence.pop());
                i++;
            }
        }
    }
}
