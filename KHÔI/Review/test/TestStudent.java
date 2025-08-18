import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
    public static void main(String[] args) {
        // Tạo ba sinh viên với tên và GPA khác nhau
        Student s1 = new Student("Fred", 3.0F);
        Student s2 = new Student("Sam", 3.5F);
        Student s3 = new Student("Steve", 2.1F);

        // So sánh GPA của s3 và s2
        if (s3.compareTo(s2) < 0) {
            System.out.println(s3.getName() + " has a lower GPA than " + s2.getName());
        }

        // Tạo TreeSet chứa các đối tượng Student
        Set<Student> studentSet = new TreeSet<>();

        // Thêm các sinh viên vào TreeSet
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        // Duyệt qua TreeSet bằng Iterator và in tên sinh viên
        Iterator<Student> i = studentSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().getName());
        }
    }
}
