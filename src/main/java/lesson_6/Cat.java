package lesson_6;

public class Cat extends Animals {
    public Cat(String name, int maxRun, int maxSwim, int sprint) {
        super(name, maxRun, maxSwim, sprint);
    }
    public void run() {
        if(getMaxRun() > getSprint()) {
            System.out.println(getName() + " true");
        } else {
            System.out.println(getName() + " false");
        }
    }
    public void swim() {
        if(getMaxSwim() > getSprint()) {
            System.out.println(getName() + " true");
        } else {
            System.out.println(getName() + " false");
        }
    }
}

