package lesson_5;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mike", "engineer", "a@mail.ru", "+79991234567", 27, 35500);
        employee1.printEmployee();
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Mike", "engineer", "a@mail.ru", "+79991234567", 27, 35500);
        employees[1] = new Employee("Alex", "engineer", "b@mail.ru", "+79991634567", 23, 35500);
        employees[2] = new Employee("Jack", "engineer", "c@mail.ru", "+79991234737", 43, 42500);
        employees[3] = new Employee("Nick", "tim lied", "d@mail.ru", "+79991174567", 41, 55500);
        employees[4] = new Employee("Jenifer", "engineer", "e@mail.ru", "+79991044567", 30, 42500);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printEmployee();
            }
        }
    }
}
