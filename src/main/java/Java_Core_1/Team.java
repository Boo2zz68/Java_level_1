package Java_Core_1;

public class Team {
    private String name;
    private int age;
    private int maxDistance;
    public Team(String name, int age, int maxDistance) {
        this.name = name;
        this.age = age;
        this.maxDistance = maxDistance;
        System.out.println("Name " + name + " age " + age + " maxDistance " + maxDistance);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMaxDistance() {
        return maxDistance;
    }
    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
    public void printTeam() {
        System.out.println("Спортсмен " + name + " преодолел забег!!!");
    }
}
