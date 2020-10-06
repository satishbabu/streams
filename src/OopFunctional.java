import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class OopFunctional {

    public static void main(String[] args) {
        System.out.println(createDogs().stream()
                .filter(d -> d.age >= 7)
                .collect(toList()));
    }

    private static List<Dog> createDogs() {
        List<Dog> dogs = Arrays.asList(
                new Dog("Mowgli", 2),
                new Dog("Lilly", 7),
                new Dog("Max", 13),
                new Dog("Panda", 10),
                new Dog("Daisy", 1));
        return dogs;
    }
}


class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ':' + age;
    }
}