class e21{ 
    public static void main(String[] args){ 
        //main program here... 
        for(PaperCurrencyRMB pc:PaperCurrencyRMB.values())
        System.out.println(pc+":"+pc.ordinal());
    }
}

enum PaperCurrencyRMB{
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
