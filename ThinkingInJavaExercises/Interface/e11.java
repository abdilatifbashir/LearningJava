class e11{ 
    public static void main(String[] args){ 
        //main program here... 
        Apply.process(new SwapAdapter(new SwapCharacter()),"ABCDEFG");
    }
}

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapCharacter{
    String process(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length() - 1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
    String name(){
        return getClass().getSimpleName();
    }
}

class SwapAdapter implements Processor{
    private SwapCharacter swapCharacter;
    public SwapAdapter(SwapCharacter sc){
        swapCharacter=sc;
    }

    @Override
    public String name() {
        return swapCharacter.name();
    }

    @Override
    public Object process(Object input) {
        return swapCharacter.process((String)input);
    }
}
