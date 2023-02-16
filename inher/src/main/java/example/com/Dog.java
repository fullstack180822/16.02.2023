package example.com;

import com.google.gson.Gson;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

public class Dog extends Animal {

    @Getter
    @Setter
    private int barkVolume;

    private int barkVolume2;

    public Dog(String name) {
        //super(); // new Animal() // default
        this(name, 0.5f);
    }

    public Dog(String name, float age) {
        //super(); // new Animal() // default
        this(name, age, 1);
    }

    public Dog(String name, float age, int barkVolume) {
        //super(); // new Animal() // default
        super(name, age);
        // write to log creation of dog
        // send message to db
        this.barkVolume = barkVolume;
        System.out.format("new dog %s created ", name);

    }

    @Override
    public void makeSound() {
        System.out.println("haw haw");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "super: [" +
                super.toString() +
                "] barkVolume=" + barkVolume +
                '}';
    }
}
