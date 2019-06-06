import java.util.Scanner;

public class GameController {

    public GameController() {

    }

    public void startGame(Scanner scanner, String difficulty) {
        System.out.println("1");
        Game game = new Game();

        char[][] board = game.getBoard();

        if(difficulty.equals("easy"))
            game.setDifficulty(Game.Level.Easy);
        else if(difficulty.equals("medium"))
            game.setDifficulty(Game.Level.Medium);
        else
            game.setDifficulty(Game.Level.Hard);

        while(true){
            try{
                System.out.print("Enter the coordinates: ");

                String cmd = scanner.nextLine();

                this.validCoordinates(cmd, board);

                String[] coordinates = cmd.split(" ");
                int x = Integer.parseInt(coordinates[0])-1, y = Integer.parseInt(coordinates[1])-1;

                board[2-y][x] = 'X';
                String res = this.validResult(board);

                this.printBoard(board);

                if(res.equals("Game not finished")){
                    continue;
                }
                else if(res.equals("Impossible"));
                else{
                    System.out.println(res);
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
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

    public String validResult(char[][] board){
        int correct = 0;
        String output = "";

        // Detect winner
        if(board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            output = board[1][0] + " wins";
            correct++;
        }
        if(board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            System.out.println(board[2][0] + " wins");
            correct++;
        }
        if(board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            output = board[0][1] + " wins";
            correct++;
        }
        if(board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            output = board[0][2] + " wins";
            correct++;
        }
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            output = board[0][0] + " wins";
            correct++;
        }
        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            output = board[0][2] + " wins";
            correct++;
        }

        int numOfO = 0, numOfX = 0, totalNum = 0;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='O'){
                    //numOfO++;
                    totalNum++;
                }
                else if(board[i][j]=='X'){
                    //numOfX++;
                    totalNum++;
                }
            }
        }



        if(correct > 1)     output = "Impossible";
        else if(correct == 0 && totalNum != 9){
            output = "Game not finished";
        }
        else if(correct == 0 && totalNum == 9){
            output = "Draw";
        }
        return output;
    }

    public void validCoordinates(String cmd, char[][] b) throws Exception{
        String[] coordinates = cmd.split(" ");

        if(coordinates.length != 2 || coordinates[0].length() > 1 || coordinates[1].length() > 1)
            throw new Exception("You should enter numbers!");

        int x = Integer.parseInt(coordinates[0])-1, y = Integer.parseInt(coordinates[1])-1;

        if(x > 3 || y > 3)
            throw new Exception("Coordinates should be from 1 to 3!");

        if(b[2-y][x] != ' ')
            throw new Exception("This cell is occupied! Choose another one!");
    }
}
