package lesson_6;

public class Cat extends Animals {
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Onyx", 200, 0);
    }
}
