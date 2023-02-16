package example.com;

public class Main {

    public static void main(String[] args) {

        System.out.format("pie = %f \n", Circle.getPie());

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle(7);

        //Circle.getPie();
        c1.getPie(); // is this wrong ?

        System.out.format("area  = %f , pie = %f \n", c1.getArea(), Circle.getPie());
        Circle.setPie(3.9f);
        System.out.println("after change...");
        System.out.format("area  = %f , pie = %f \n", c1.getArea(), Circle.getPie());

        //c1.setPie = 4;
        //c2.setPie = 4;
        //c3.setPie = 4;

        // Targil:
        // Create AndroidDevice class:
        // static private field latestOsVersion float
        // getter/setter
        // function static String getLatestOsVersionName -- switch case: 4.4: Kitkat 5.1: Lollipop 6.0: Marshmallow
        // add private final int price -- get the price in the ctor
        // create a getter for the price. can we create a setter?
        // add private int batteryPercentag + getter/stter
        // create a toString which print the price + battery + latest OS
        // in main:
        // set last version to KitKat
        // create 3 devices
        // print one of the devices
        // change the latest os Marshmallow
        // print one of the devices
        // use Debugger and watch the toString in each line



    }


}
