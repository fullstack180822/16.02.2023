package example.com;

import java.util.Random;

public class Circle {

    private float radius;
    private static float pie = 3.14f;

    public static float getPie() {
        //System.out.println(this.radius);
        return pie;
        //this.getPie();

    }

    public static void setPie(float pie) {
        Circle.pie = pie;
        //this.pie = 3;
    }

    // ctor static
    static  {

    }

    public Circle(float radius) {
        this.radius = radius;
        //this.pie = 3.14f * (new Random().nextFloat()); // final can be assigned a  different value bot only during ctor
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getArea() {
        return this.pie * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Circle: { radius: %f } area = %f", this.radius, this.getArea());
    }
}
