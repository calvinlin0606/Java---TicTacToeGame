public class GameController {

    public GameController() {

    }

    public void startGame() {
        Game game = new Game();
    }

    public void setMove(){

    }

    public void printBoard(char[][] b){
        System.out.println("---------");

        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("---------");
    }

    public void validResult(char[][] board, int numOfO, int numOfX, int totalNum){
        int correct = 0;
        String output = "";

        // Detect winner
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            output = board[1][0] + " wins";
            correct++;
        }
        if(board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            System.out.println(board[2][0] + " wins");
            correct++;
        }
        if(board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            output = board[0][1] + " wins";
            correct++;
        }
        if(board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            output = board[0][2] + " wins";
            correct++;
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            output = board[0][2] + " wins";
            correct++;
        }

        if(correct > 1)     output = "Impossible";
        else if(numOfO - numOfX >= 2 || numOfX - numOfO >= 2)
            output = "Impossible";
        else if(correct == 0 && totalNum != 9){
            output = "Game not finished";
        }
        else if(correct == 0 && totalNum == 9){
            output = "Draw";
        }

        System.out.println(output);
    }
}
