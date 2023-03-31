package game;

import java.util.ArrayList;

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

    public void direction(Position position) {
        float dx = Math.abs(this.x - position.x);
        float dy = Math.abs(this.y - position.y);
        if (dx > dy) {
            if (this.x < position.x)
                this.x += 1;
            else
                this.x -= 1;
        } else if (this.y < position.y)
            this.y += 1;
        else
            this.y -= 1;
    }

    public double getDistance(BaseUnit baseUnit) {
        return 0;
    }

    public boolean[] checkPos(ArrayList<BaseUnit> whiteSide) {
        boolean[] temp = new boolean[4];
        for (BaseUnit u : whiteSide) {
            if ((u.position.x == this.x + 1) && (u.position.y == this.y))
                temp[0] = true;
            if ((u.position.x == this.x - 1) && (u.position.y == this.y))
                temp[1] = true;
            if ((u.position.x == this.x) && (u.position.y == this.y + 1))
                temp[2] = true;
            if ((u.position.x == this.x) && (u.position.y == this.y - 1))
                temp[3] = true;
        }
        return temp;

    }

}
