package chapter09;

public class Exercise_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("宽为: " + rectangle1.width + ", 高为: " + rectangle1.height + ", 面积为: " + rectangle1.getArea()
                + ", 周长为: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("宽为: " + rectangle2.width + ", 高为: " + rectangle2.height + ", 面积为: " + rectangle2.getArea()
                + ", 周长为: " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    };

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}