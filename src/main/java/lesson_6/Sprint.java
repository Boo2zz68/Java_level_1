package lesson_6;

public class Sprint {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Onyx", 200, 0, 300);
        Dog dog1 = new Dog("Rex", 500, 10, 300);
        Cat cat2 = new Cat("Bim", 200, 0, 100);
        Dog dog2 = new Dog("Polly", 500, 10, 700);
        cat1.run();
        cat1.swim();
        cat2.run();
        cat2.swim();
        dog1.run();
        dog1.swim();
        dog2.run();
        dog2.swim();
    }
}
