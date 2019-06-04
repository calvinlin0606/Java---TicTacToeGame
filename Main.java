import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter cells: ");

        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        char[] c = cmd.toCharArray();

        int row = 0, col = 0;
        char[][] board = new char[3][3];

        int numOfO = 0, numOfX = 0, totalNum = 0;

        for(int i=1;i<c.length-1;i++){
            board[row][col++] = c[i];
            if(i % 3 == 0){
                row++;
                col = 0;
            }
            if(c[i] == 'O'){
                numOfO++;
                totalNum++;
            }
            else if(c[i] == 'X'){
                numOfX++;
                totalNum++;
            }
        }

        // Print out the board
        GameController gc = new GameController();

        gc.printBoard(board);

        while(true){
            try{
                System.out.print("Enter the coordinates: ");

                cmd = scanner.nextLine();

                String[] coordinates = cmd.split(" ");

                if(coordinates.length != 2 || coordinates[0].length() > 1 || coordinates[1].length() > 1)
                    throw new Exception("You should enter numbers!");

                int x = Integer.parseInt(coordinates[0])-1, y = Integer.parseInt(coordinates[1])-1;

                if(x > 3 || y > 3)
                    throw new Exception("Coordinates should be from 1 to 3!");

                if(board[2-y][x] != ' ')
                    throw new Exception("This cell is occupied! Choose another one!");

                board[2-y][x] = 'X';
            }catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }

            break;
        }

        gc.printBoard(board);
    }
}
