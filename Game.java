public class Game {
    private char[][] borad;
    private String difficulty;

    private Player p1;
    private Player p2;

    public char[][] getBorad(){ return borad; }
    public String getDifficulty(){ return difficulty; }

    public void setBorad(char[][] borad) { this.borad = borad; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}
