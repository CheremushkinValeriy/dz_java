package game;

import game.Class.BaseUnit;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistans(BaseUnit unit) {
        return Math.sqrt(Math.pow(x - unit.position.x, 2) + Math.pow(y - unit.position.y, 2));

    }

    public boolean isEquals(Position position) {
        return (position.x == this.x & position.y == this.y);
    }

}
