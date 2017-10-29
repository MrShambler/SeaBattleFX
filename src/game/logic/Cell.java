package game.logic;

/**
 * Created by NEWIVAN on 15.10.2017.
 */
public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
