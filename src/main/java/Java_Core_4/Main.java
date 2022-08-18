package Java_Core_4;

public class Main {
    public static void main(String[] args) {
        doPhoneBook();
        Array array = new Array(Array());
        array.doArray();
    }
    private static void doPhoneBook() {
        Phone phoneBook = new Phone();
        phoneBook.addElementPhone("Alex","89670049109");
        phoneBook.addElementPhone("Alex","89670049110");
        phoneBook.addElementPhone("Alex","89670049111");
        phoneBook.addElementPhone("Alex","888888");
        phoneBook.addElementPhone("Timmy","888888");
        phoneBook.addElementPhone("Timmy","888888   ");
        phoneBook.addElementPhone("Timmy","888  88 8 ");
        phoneBook.addElementPhone("Timmy","8  8  8 888     ");

        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Timmy: " + phoneBook.getPhonesByName("Timmy"));
        System.out.println("Oleg: " + phoneBook.getPhonesByName("Oleg"));
        System.out.println("Nikto: " + phoneBook.getPhonesByName("Nikto"));
    }
    private static String[] Array() {
        String[] array = new String[]{"Cat", "Dog", "Mick", "Cat", "Pig", "Alex", "Mouse", "Dog", "Eagle", "Pig"};
        return array;
    }
}
