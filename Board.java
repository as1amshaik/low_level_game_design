public class Board {
    int dim;
    char[][] b;
    int fill;
    public Board(int n) {
        dim=n;
        b = new char[dim][dim];
        build_board();
        fill=0;

    }
    private void build_board(){
        int n=1;
        System.out.println("bbb");
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                b[i][j]=(char)n++;
            
            
            }}

    }
    boolean isDrawState(){
        return fill==dim*dim - 1;
    }
  
   
     boolean  markBoard(Player p,int pos){
        int i = (pos - 1) / 3;
        int j = (pos - 1) % 3;
        if(Character.isDigit(b[i][j])){
            b[i][j]=p.symbol;
            fill++;
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
    void displayWin(){
        System.out.println("Displaying win board");
    }
    
}
