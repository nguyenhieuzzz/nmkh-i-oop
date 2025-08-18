public class TestAccess {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();

        // Gọi phương thức public
        example.publicMethod();

        // Gọi phương thức private sẽ báo lỗi vì không thể truy cập từ ngoài lớp
        // example.privateMethod(); // Lỗi: phương thức private chỉ có thể truy cập trong lớp AccessExample

        // Gọi phương thức protected (chỉ có thể trong cùng package hoặc subclass)
        example.protectedMethod();
    }
}
