package chapter9;

public class Exercise_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("周长为: " + regularPolygon1.getPerimeter() + ", 面积为： " + regularPolygon1.getArea());
        System.out.println("周长为：" + regularPolygon2.getPerimeter() + "， 面积为：" + regularPolygon2.getArea());
        System.out.println("周长为：" + regularPolygon3.getPerimeter() + ", 面积为：" + regularPolygon3.getArea());
    }
}

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int number, double newSide) {
        n = number;
        side = newSide;
        x = 0;
        y = 0;
    }

    RegularPolygon(int numberSide, double newSide, double xPoint, double yPoint) {
        n = numberSide;
        side = newSide;
        x = xPoint;
        y = yPoint;
    }

    public void setSideNumber(int number) {
        n = number;
    }

    public int getSideNumber() {
        return n;
    }

    public void setSide(double sideLen) {
        side = sideLen;
    }

    public double getSide() {
        return side;
    }

    public void setXPoint(double xPoint) {
        x = xPoint;
    }

    public double getXPoint() {
        return x;
    }

    public void setYPoint(double yPoint) {
        y = yPoint;
    }

    public double getYPoint() {
        return y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
    }
}
