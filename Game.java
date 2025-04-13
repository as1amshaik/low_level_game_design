public class Game {
    Board board;
    Player[] players;
    WinChecker winChecker;
    int currentPlayer;
    GameStatus status;

    public Game(int dim, Player[] players) {
        this.board = new Board(dim);
        this.players = players;
        this.status = GameStatus.ONGOING;
        this.currentPlayer = 0;
    }

    public void playTurn(int pos) {
        Player p = players[currentPlayer];
        
        currentPlayer ^= 1;
    }
}