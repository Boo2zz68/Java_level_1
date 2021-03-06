package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat (Plate plate) {
        plate.decriesFood(appetite);
    }
    public void info() {
        System.out.println("Cat: name - " + name + ", appetite - " + appetite);
    }
}
