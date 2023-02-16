package example.com;

public class Main {

    public static void main(String[] args) {

        Animal rexy = new Animal("rexy", 2.5f);
        System.out.println(rexy);

        Dog rex = new Dog("Rex", 3.4f, 9);

        Dog rex2 = new Dog("Rex", 3.4f);

        Dog rex3 = new Dog("Rex iii");

        System.out.println(rex);

    }

}
