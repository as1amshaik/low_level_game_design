 class TTTGameResultStrategy implements GameResultStrategy{
        @Override
        public boolean check_win(char[][] b,int pos){
                int dim = b.length;
                int r = (pos - 1) / 3;
                int c = (pos - 1) % 3;
                if(check_rc(b, r, c))return true;
                if(isDiag(r,c,dim)){
                    if(check_dia(b,r,c))return true;
                }
                return false;

        
            
        
            }
            private boolean  isDiag(int r,int c,int dim){
                if(r==c)return true;
                if(r+c == dim-1 )return true;
                return false;

            }
            private boolean check_dia(char[][] b,int r,int c){
                int diaCount =0,antiDiaCount=0;
                char win_symbol= b[r][c];

                int dim =b.length;
                int i=0,j=0;
                while(i<dim && j<dim){
                    if(b[i][j]==win_symbol)diaCount++;
                    i++;
                    j++;
                }
                if(diaCount==dim)return true;
                i=0;
                j=dim-1;
                while(i<dim && j>=0){
                    if(b[i][j]==win_symbol)antiDiaCount++;
                    j--;
                    i++;


                }
                if(antiDiaCount==dim)return true;
                return false;



            }
            private boolean check_rc(char[][] b,int r,int c){
                char win_symbol= b[r][c];
                int dim = b.length,rowMatch=0,colMatch=0;

                for(int i=0;i<dim;i++ ){
                    if(b[r][i]==win_symbol)rowMatch++;
                    if(b[i][c]==win_symbol)colMatch++;
                }
                rowMatch-=dim;
                colMatch-=dim;
                if(rowMatch==0 || colMatch==0)return true;
                return false;
            }
}