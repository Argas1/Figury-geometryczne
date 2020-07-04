public class Calculator {

    public static double lineLenght (Point start, Point end){
        double xPow = Math.pow(end.getX() - start.getX(),2);
        double yPow = Math.pow(end.getY() - start.getY(),2);
        double xyPowSum = xPow + yPow;
        return Math.sqrt(xyPowSum);

    }
    public static double recArea(Rectangle rectangle){
        Point p1 = rectangle.getP1();
        Point p2 = rectangle.getP2();
        Point p3 = rectangle.getP3();
        Point p4 = rectangle.getP4();
        double sideA = lineLenght(p1,p2);
        double sideB = lineLenght(p1,p4);
        return sideA * sideB;
    }
    public static boolean czyPunkLezyWKole(Circle circle, Point point) {
        double A = circle.getS().getX();
        double B = circle.getS().getY();
        double x = point.getX();
        double y = point.getY();
        double result = Math.pow(x - A, 2) + Math.pow(y - B, 2);
        double radiusPow = Math.pow(circle.getR(), 2);
        return result <= radiusPow;
    }


}
