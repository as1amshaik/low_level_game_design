 class TTTGameResultStrategy implements GameResultStrategy{
        @Override
        public boolean check_win(char[][] b,char symbol){
                int dim = b.length;
        
            
                
        
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
}