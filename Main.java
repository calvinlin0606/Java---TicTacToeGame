import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        char[] c = cmd.toCharArray();
//        char[][] board = new char[3][3];
//
//        int row = 0, col = 0;
//
//        int numOfO = 0, numOfX = 0, totalNum = 0;
//
//        for(int i=1;i<c.length-1;i++){
//            board[row][col++] = c[i];
//            if(i % 3 == 0){
//                row++;
//                col = 0;
//            }
//            if(c[i] == 'O'){
//                numOfO++;
//                totalNum++;
//            }
//            else if(c[i] == 'X'){
//                numOfX++;
//                totalNum++;
//            }
//        }

        // Print out the board
        GameController gc = new GameController();

        while(true){
            try{
                System.out.print("Input command: ");
                String cmd = scanner.nextLine();
                String[] part = cmd.split(" ");

                if(part.length != 1 && part.length != 3)        // check number of arguments
                    throw new Exception("Please input correct command");

                if(part[0].equals("start")){
                    String difficulty = part[2];

                    if(!difficulty.equals("easy") || !difficulty.equals("medium") || !difficulty.equals("hard"))
                        throw new Exception("Please input correct difficulty");
                }
                else if(part[0].equals("exit"))
                    break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
