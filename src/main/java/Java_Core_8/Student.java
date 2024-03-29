package Java_Core_8;

import java.util.Objects;
import java.util.List;
public class Student {
    private final String name;
    private final List<Course> courses;
    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }
    public String getName() {
        return this.name;
    }
    public List<Course> getAllCourses() {
        return this.courses;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(courses, student.courses);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
