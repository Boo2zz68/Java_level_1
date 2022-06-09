package lesson_6;

public class Animals {
    private int sprint;
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animals(String name, int maxRun, int maxSwim, int sprint) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.sprint = sprint;
        System.out.println("Name " + name + " maxRun " + maxRun + " maxSwim " + maxSwim + " sprint " + sprint);
    }
    public int getSprint() {
        return sprint;
    }
    public void setSprint(int sprint) {
        this.sprint = sprint;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxRun() {
        return maxRun;
    }
    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
    public int getMaxSwim() {
        return maxSwim;
    }
    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }
}
