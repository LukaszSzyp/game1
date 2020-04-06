package main;

public class Gra {
    public void gameOfLife(int[][] board) {
        int[][] newBord = new int[board.length][board[0].length];
        int iloscZywychNaKwadracie =0;
        int pozX = 0;
        int pozY = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                for (int k = -1; k <=1 ; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if (i+k >=0 && j+l>=0 && i+k<board.length && j+l<board[i].length){
                            if (board[i+k][j+l] == 1) {
                                iloscZywychNaKwadracie++;
                            }
                        }
                    }
                }
                if (board[i][j] == 1) {
                    iloscZywychNaKwadracie--;
                    if (iloscZywychNaKwadracie < 2) {
                        newBord[i][j] = 0;
                    }
                    if (iloscZywychNaKwadracie >= 2 && iloscZywychNaKwadracie <= 3) {
                        newBord[i][j] = 1;
                    }
                    if (iloscZywychNaKwadracie > 3) {
                        newBord[i][j] = 0;
                    }
                } else {
                    if (iloscZywychNaKwadracie == 3) {
                        newBord[i][j] = 1;
                    }
                }
                iloscZywychNaKwadracie=0;
            }

        }
        board=newBord;

        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}
