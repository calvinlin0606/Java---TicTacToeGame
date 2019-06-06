public class Game {

    enum Level{ Easy, Medium, Hard }

    private char[][] board;
    private Level difficulty;

    private Player p1;
    private Player p2;

    public Game(){
        // Initialize board
        board = new char[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = ' ';
            }
        }
    }

    public char[][] getBoard(){ return board; }
    public Level getDifficulty(){ return difficulty; }
    public Player getP1(){ return p1; }
    public Player getP2(){ return p2; }

    public void setBoard(char[][] board) { this.board = board; }
    public void setDifficulty(Level difficulty) { this.difficulty = difficulty; }
    public void setP1(Player p1) { this.p1 = p1; }
    public void setP2(Player p2) { this.p2 = p2; }
}
