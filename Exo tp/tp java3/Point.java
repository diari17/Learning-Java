public class Point {
    private float x, y;

    // les constructeurs
    public Point() {
    }

    public Point(float vx, float vy) {
        x = vx;
        y = vy;
    }

    public Point(Point P) {
        x = P.x;
        y = P.y;
    }

    // les getter et setter
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float vX) {
        x = vX;
    }

    public void setY(float vY) {
        y = vY;
    }

    public void deplacer(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(float x, float y) {
        return (float) Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public float distance(Point pt) {
        return (float) Math.sqrt(Math.pow(this.x - pt.x, 2) + Math.pow(this.y - pt.y, 2));
    }

    public static float distance(float x1, float y1, float x2, float y2) {
        float distance = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public void translater(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "x = " + getX() + " y = " + getY() + " .";
    }

}