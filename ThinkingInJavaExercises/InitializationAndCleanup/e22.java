class e22{ 
    public static void main(String[] args){ 
        //main program here... 
        PaperCurrencyRMB pcRMB=PaperCurrencyRMB.TEN;
        switch(pcRMB){
            case ONE:System.out.println("1 yuan is green.");break;
            case FIVE:System.out.println("5 yuan is purple");break;
            case TEN:System.out.println("10 yuan is blue");break;
            case TWENTY:System.out.println("20 yuan is yellow");break;
            case FIFTY:System.out.println("50 yuan is dark green");break;
            case HUNDRED:
            default:System.out.println("100 yuan is red");break;
        }
    }
}

enum PaperCurrencyRMB{
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
