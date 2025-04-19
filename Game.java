public class Game {
    // MAINTAINING SRP decoupling check valid moves and check winner 
    // from board to higher level abstraction game 
    // where borad controls moves and game checks the status of game
    Board board;
    Player[] players;
    int currentPlayer;
    GameStatus status;
    GameResultStrategy strategy;

     Game(int dim, Player[] players,GameResultStrategy strategy) {
        this.board = new Board(dim);
        this.players = players;
        this.status = GameStatus.ONGOING;
        this.currentPlayer = 0;
        this.strategy=strategy;
    }

    public void playTurn(int pos) {
        Player p = players[currentPlayer];
        if(board.markBoard(p, pos)){
            if(strategy.check_win(board.b, pos)){
                status=GameStatus.WIN;
                board.displayWin();
            }
            if(board.isDrawState()){
                status=GameStatus.DRAW;
            }



        }
        
        currentPlayer ^= 1;
    }
}