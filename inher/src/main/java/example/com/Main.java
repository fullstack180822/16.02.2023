package example.com;

public class Main {

    public static void main(String[] args) {

        Animal rexy = new Animal("rexy", 2.5f);
        System.out.println(rexy);

        Dog rex = new Dog("Rex", 3.4f, 9);

        Dog rex2 = new Dog("Rex", 3.4f);

        Dog rex3 = new Dog("Rex iii");

        System.out.println(rex);

        // create a base class Phone
        // fields: private  size, color
        // @ Getter/ @ Setter
        // ctor with all args (+lombok?)
        // toString prints all fields
        // create a sub class Android
        // fields: private osVersion
        // @ Getter/ @ Setter
        // toString which prints osVersion + super to-string
        // ctor which gets size, color, osVersion
        // ctor which gets size, osVersion (default color will be Black)
        // ctor which gets osVersion (default size will be 6.5f and will call the other ctor)

    }

}
