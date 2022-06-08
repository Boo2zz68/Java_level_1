package lesson_6;

public class Animals {
   final private int sprint = 330;
   private String name;
   private int maxRun;
   private int maxSwim;
    public int getSprint() {
        return sprint;
    }
    public int getMaxSwim() {
        return maxSwim;
    }
    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }
    public int getMaxRun() {
        return maxRun;
    }
    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        System.out.println("Name" + name + " maxRun" + maxRun + " maxSwim" + maxSwim);
    }
}
