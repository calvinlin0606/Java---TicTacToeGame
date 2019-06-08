import java.util.Scanner;

public class AIPlayer extends Player {

    // Moves that AI make will depend on difficulty of the game
    public void setMove(Game game, Scanner scanner){
        Game.Level level = game.getDifficulty();

        if(level == Game.Level.Easy){

        }else if(level == Game.Level.Medium){

        }else{

        }
    }
}
