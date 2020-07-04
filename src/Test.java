public class Test {
    public static void main(String[] args) {
    Point p1 = new Point(0,5);
    Point p2 = new Point(10,5);
    Point p3 = new Point(10,0);
    Point p4 = new Point(0,0);
    Rectangle rectangle = new Rectangle(p1,p2,p3,p4);
    double recArea = Calculator.recArea(rectangle);
        System.out.println("Pole prostokąta to : " + recArea);


        Point center = new Point(0,0);
        Circle circle = new Circle(center,10);
        Point pointOk = new Point(0,9);
        Point pointNotOk = new Point(0,11);
        boolean pointInsideCircleOk = Calculator.czyPunkLezyWKole(circle,pointOk);
        boolean pointInsideCircleNotOk = Calculator.czyPunkLezyWKole(circle,pointNotOk);
        System.out.println("Pierwszy punkt leży w okręgu : " + pointInsideCircleOk);
        System.out.println("Drugi punkt leży w okręgu : " + pointInsideCircleNotOk);

    }
}
