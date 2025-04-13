public class Board {
    int dim;
    char[][] b;
    boolean game_end;
    public Board(int n) {
        dim=n;
        b = new char[dim][dim];
        build_board();
        status = GameStatus.ONGOING;
        game_end=false;
        winChecker = grs;

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
            return true;
            // showing it as a valid move 
            

        }
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
