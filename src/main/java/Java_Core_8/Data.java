package Java_Core_8;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Data {
    public static List<Student> getStudentsList() {
        // ������ ������
        Course course1 = new Course("���������");
        Course course2 = new Course("���������");
        Course course3 = new Course("����������������");
        Course course4 = new Course("����������");
        Course course5 = new Course("������������� ������������ �� Java");
        Course course6 = new Course("������������ backend �� Java");
        Course course7 = new Course("������������ ���-����������");
        Course course8 = new Course("���� ������");
        Course course9 = new Course("Linux ��������� �������������");
        Course course10 = new Course("������ ������� ������������");
        Course course11 = new Course("������ ����-���������");
        Course course12 = new Course("Git. ������� ����");

        // ������ ���������
        Student student1 = new Student("�������_1", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("�������_2", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("�������_3", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("�������_4", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student5 = new Student("�������_5", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("�������_6", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("�������_7", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("�������_8", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("�������_9", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("�������_10", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("�������_11", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("�������_12", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("�������_13", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("�������_14", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("�������_15", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("�������_16", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("�������_17", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("�������_18", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("�������_19", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("�������_20", Arrays.asList(course9, course5, course3));
        Student student21 = new Student("�������_21", Arrays.asList(course8, course6, course5));
        Student student22 = new Student("�������_22", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("�������_23", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("�������_24", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("�������_25", Arrays.asList(course4, course12, course5));
        Student student26 = new Student("�������_26", Arrays.asList(course3, course9, course5));
        Student student27 = new Student("�������_27", Arrays.asList(course2, course6, course3));
        Student student28 = new Student("�������_28", Arrays.asList(course1, course9, course5));

        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }
    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }
    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("���������"),
                new Course("���������"),
                new Course("����������������"),
                new Course("����������"),
                new Course("������������� ������������ �� Java"),
                new Course("������������ backend �� Java"),
                new Course("������������ ���-����������"),
                new Course("���� ������"),
                new Course("Linux ��������� �������������"),
                new Course("������ ������� ������������"),
                new Course("������ ����-���������"),
                new Course("Git. ������� ����"));
    }
}
