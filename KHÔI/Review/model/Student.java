public class Student implements Comparable<Student> {
    private String name;
    private float gpa;

    // Constructor có tham số
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Constructor không tham số
    public Student() {}

    // Getter và Setter nếu cần (tùy chọn)
    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    // Override compareTo để so sánh theo GPA
    @Override
    public int compareTo(Student other) {
        if (this.gpa < other.gpa) return -1;
        else if (this.gpa > other.gpa) return 1;
        else return 0;
    }

    // In thông tin sinh viên (tùy chọn)
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}
