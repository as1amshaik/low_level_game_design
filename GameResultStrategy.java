 interface  GameResultStrategy {
    boolean check_win(char[][] b,int pos);
    // extensibility making rules to be flexible 
    // not hard coded into the game so that game can be easily 
    // changable based on players need 
    
}
