public class Board {
    int dim;
    char[][] b;
    boolean game_end;
    public Board(int n) {
        dim=n;
        b = new char[dim][dim];
        build_board();
        game_end=false;

    }
    private void build_board(){
        int n=1;
        System.out.println("bbb");
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                b[i][j]=(char)n++;
            
            
            }}

    }
    
    boolean place(Player p,int pos){
        if(markBoard( pos, p)){
            System.out.println(p.name+ "placed at pos : "+pos);
            if(check_result(p)){
                System.out.println(p.name+ " wins .. Clearing game");
                game_end=true;
                build_board();

            }
            return true;

        }
        System.out.println("Move not valid");
        return false;

    }
    private boolean check_result(Player p){
        char symbol=p.symbol;
        

        // Check rows
        for (int i = 0; i < dim; i++) {
            boolean rowWin = true;
            for (int j = 0; j < dim; j++) {
                if (b[i][j] != symbol) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }

        // Check columns
        for (int j = 0; j < dim; j++) {
            boolean colWin = true;
            for (int i = 0; i < dim; i++) {
                if (b[i][j] != symbol) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) return true;
        }

        // Check main diagonal
        boolean mainDiagonalWin = true;
        for (int i = 0; i < dim; i++) {
            if (b[i][i] != symbol) {
                mainDiagonalWin = false;
                break;
            }
        }
        if (mainDiagonalWin) return true;

        // Check anti-diagonal
        boolean antiDiagonalWin = true;
        for (int i = 0; i < dim; i++) {
            if (b[i][dim - 1 - i] != symbol) {
                antiDiagonalWin = false;
                break;
            }
        }
        if(antiDiagonalWin) return true;

        // If no win condition is met
        return false;


    }
    private boolean  markBoard(int pos,Player p){
        int i=pos/dim;
        int j=pos%dim;
        if(Character.isDigit(b[i][j])){
            b[i][j]=p.symbol;
            return true;
        }
        return false;

    }
    void display(){
        System.out.println("");


        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                System.out.print(b[i][j]+ " | ");
            }
            System.out.println("");

        }
    }
    
}
