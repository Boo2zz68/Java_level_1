package lesson_5;

public class Employee {
        private String name;
        private String post;
        private String email;
        private String number;
        private int age;
        private  int salary;
    public Employee( String name, String post, String email,  String number, int age, int salary){
            this.name = name;
            this.post = post;
            this.email = email;
            this.number = number;
            this.age = age;
            this.salary = salary;
        }
        public void printEmployee () {
            System.out.println("name:" + name + " post:" + post + " email:" + email + " number:" + number + " age:" + age + " salary:" + salary);
        }
        public int getAge() {
            return age;
        }
}
