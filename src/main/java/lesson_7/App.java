package lesson_7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Persik", 100);
        Cat cat2 = new Cat("Omar", 80);
        Cat cat3 = new Cat("Platon", 150);
        Plate plate1 = new Plate(180);
        Plate plate2 = new Plate(350);
        cat1.info();
        cat2.info();
        cat3.info();
        cat1.eat(plate1);
        cat2.eat(plate1);
        cat3.eat(plate1);
        plate1.info();
        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate2);

        }
    }
}
