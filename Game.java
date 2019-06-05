public class Game {

    enum Level{
        Easy,
        Medium,
        Hard
    }

    private char[][] borad;
    private Level difficulty;

    private Player p1;
    private Player p2;

    public char[][] getBorad(){ return borad; }
    public Level getDifficulty(){ return difficulty; }

    public void setBorad(char[][] borad) { this.borad = borad; }
    public void setDifficulty(Level difficulty) { this.difficulty = difficulty; }
}
