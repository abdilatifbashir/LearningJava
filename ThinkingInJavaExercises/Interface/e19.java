class e19{
    public static void play(GameController gc){
        TossingGame tg = gc.getTossingGame();
        tg.toss();
    }

    public static void main(String[] args){
        //main program here...
        play(new CoinTossingFactory());
        play(new DiceTossingFactory());
    }
}

interface TossingGame{
    void toss();
}

interface GameController{
    TossingGame getTossingGame();
}

class CoinTossing implements TossingGame{
    @Override
    public void toss() {
        System.out.println("CoinTossing.toss()");
    }
}

class CoinTossingFactory implements GameController{
    @Override
    public TossingGame getTossingGame() {
        return new CoinTossing();
    }
}

class DiceTossing implements TossingGame{
    @Override
    public void toss() {
        System.out.println("DiceTossing.toss()");
    }
}

class DiceTossingFactory implements GameController{
    @Override
    public TossingGame getTossingGame() {
        return new DiceTossing();
    }
}
