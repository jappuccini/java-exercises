package demo.java2.dsa.recursion.maze;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Point toTop() {
        return new Point(x, y - 1);
    }

    private Point toRight() {
        return new Point(x + 1, y);
    }

    private Point toBottom() {
        return new Point(x, y + 1);
    }

    private Point toLeft() {
        return new Point(x - 1, y);
    }

    public String toString() {
        return "Point [x=" + x + "]" + "[y=" + y + "]";
    }

    public Point[] getDirections() {
        return new Point[] {
                toTop(),
                toRight(),
                toBottom(),
                toLeft() };
    }
}