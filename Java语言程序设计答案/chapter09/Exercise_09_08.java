package chapter09;

public class Exercise_09_08 {
    public static void main(String[] args) {
        final int FAST = 3;
        final int MEDIUM = 2;
        final int SLOW = 1;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        fan1.setSpeed(SLOW);
        fan1.setRadius(3);
        fan1.setColor("red");
        fan1.turnOn();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}

class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "bule";
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public int getSpeed() {
        switch (speed) {
            case SLOW:
                speed = SLOW;
                break;
            case MEDIUM:
                speed = MEDIUM;
                break;
            case FAST:
                speed = FAST;
                break;
        }
        return speed;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\n";
        } else {
            return "\nFan color: " + color + ", radius: " + radius + "\nfan is off\n";
        }
    }
}
