package lesson_7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void decriesFood (int appetite) {
        if (food >= appetite) {
            food -= appetite;
            System.out.println("true " + food);
        } else {
            System.out.println("false " + food);
        }

    }
    public void info() {
        System.out.println("Food in a Plate: " + food);
    }
}
