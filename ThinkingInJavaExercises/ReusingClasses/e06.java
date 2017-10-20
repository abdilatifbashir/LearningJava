class e06{ 
    public static void main(String[] args){ 
        //main program here... 
        Chess.main(null);
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        //super(i); 注释此语句会报错，因为构造器为有参，要显式调用
        System.out.println("BoardGame constructor");
    }
}
class Chess extends BoardGame {
    Chess() {
        System.out.println("Chess constructor");
        super(11);//此语句会报错，因为基类构造器方法应该最先被调用
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}