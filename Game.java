public class Game {

    enum Level{ Easy, Medium, Hard }

    private char[][] board;
    private Level difficulty;

    private Player p1;
    private Player p2;

    private int turn;

    public Game(){
        // Initialize board
        board = new char[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = ' ';
            }
        }

        turn = 1;
    }

    public char[][] getBoard(){ return board; }
    public Level getDifficulty(){ return difficulty; }
    public Player getP1(){ return p1; }
    public Player getP2(){ return p2; }
    public int getTurn(){ return turn; }

    public void setBoard(char[][] board) { this.board = board; }
    public void setCoordinates(int x, int y, char label) { board[x][y] = label; }
    public void setDifficulty(Level difficulty) { this.difficulty = difficulty; }
    public void setP1(Player p1) { this.p1 = p1; }
    public void setP2(Player p2) { this.p2 = p2; }
    public void setTurn(int turn) { this.turn = turn; }
}
