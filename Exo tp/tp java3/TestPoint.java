public class TestPoint {
    public static void main(String[] args) {
        Point test = new Point(2, 5);
        System.out.println(test.toString());
        Point test2 = new Point(3, 6);
        float dis = test.distance(test2);
        System.out.println(dis);

    }

}
