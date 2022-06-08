package lesson_6;

public class Dog extends Animals {
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 500, 10);
    }
}
