package Java_Core_3;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Fruit();
        String[] array = {"Tom", "Don", "Cat", "Dog", "Set"};
        Array(array, 1,2);
        Integer[] integers = {5, 4, 3, 2, 1};
        ArrayWithoutTemp(integers, 1,2);
    }
        private static void Fruit() {
            Box<Apple> appleBox = new Box<Apple>(1);
            Box<Orange> orangeBox = new Box<Orange>(1.5);
            Box<Apple> appleBox2 = new Box<Apple>(1);
            for (int i = 0; i < 3; i++) {
                orangeBox.addFruit(new Orange());
                appleBox.addFruit(new Apple());
                appleBox2.addFruit(new Apple());
            }
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
            System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
            System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
            System.out.println("Weights equals - " + appleBox.compare(orangeBox));
            System.out.println("---------------------------------------------");
            appleBox.addFruits(appleBox2);
        }
    private static void ArrayWithoutTemp(Integer[] integers, int i, int j) {
        Integer a = integers[i];
        Integer b = integers[j];
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        integers[i] = a;
        integers[j] = b;
        printArray(integers);
    }
    public static void Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }
    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
    }

