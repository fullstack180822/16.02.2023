package example.com;

import com.google.gson.Gson;
import lombok.*;

public class Animal {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private float age;

    public Animal(String name, float age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
