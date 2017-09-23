class e06{ 
    public static void main(String[] args){ 
        //main program here... 
        System.out.println(test(5,1,6));
        System.out.println(test(10,1,6));
    }
    static int test(int testval,int begin,int end) {
            if(testval > begin && testval < end)
                return 1;
            else
                return 0; // Match
        }
}
