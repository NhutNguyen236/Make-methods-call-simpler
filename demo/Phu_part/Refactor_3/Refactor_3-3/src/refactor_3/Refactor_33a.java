package refactor_3;

import java.util.*;

public class Refactor_33a {

    public static void main(String[] args) {

        Animal animal = new Cat("Persian");

//        Instead of downcasting explicity...
        Cat cat = (Cat) animal;
        // ... encapsulate it in method!
        Cat cat2 = animal.createCat(animal);
//        Now cat2 instance can use class Cat method
        cat2.introduce();
        cat2.meow();
        cat2.eat();

    }

    static class Animal {

        public Animal() {
        }

        public void eat() {
            System.out.println("Eat something...");
        }

        Cat createCat(Object object) {
            return (Cat) object;
        }
    }

    static class Cat extends Animal {

        private String breed;

        public Cat(String breed) {
            this.breed = breed;
        }

        public void introduce() {
            System.out.println("Hi, I am a " + breed);
        }

        public void meow() {
            System.out.println("Meow meow...");
        }

        @Override
        public void eat() {
            System.out.println("Eat salmon");
        }

    }
}
