import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

                    if(!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard"))        // check difficulty
                        throw new Exception("Please input correct difficulty");

                    gc.startGame(scanner, difficulty);
                }
                else if(part[0].equals("exit"))
                    break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
