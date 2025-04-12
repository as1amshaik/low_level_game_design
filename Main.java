import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Board game");
        System.out.println("Please enter the dimensions of the board");
        int d= scanner.nextInt();
        Board board= new Board(d);
        board.display();
        System.out.println(" Enter player 1 name and symbol");
        String name_1=scanner.nextLine();
        char c1=scanner.nextLine().charAt(0);
        Player p1 = new Player(name_1,c1);

        System.out.println(" Enter player 2 name and symbol");
        String name_2=scanner.nextLine();
        char c2=scanner.nextLine().charAt(0);
        Player p2 = new Player(name_2,c2);
        Player[]  players= new Player[2];
        players[0]=p1;
        players[1]=p2;
      
        int pt=1;
        while(!board.game_end){
            board.display();
            System.out.println("Please choose the postion you want to play on  board");
            int pos= scanner.nextInt();
            board.place(players[pt], pos);
            pt^=1;
        }





        
    }
}