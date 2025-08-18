public class AccessExample {
    
    // Phương thức public có thể truy cập từ bất kỳ đâu
    public void publicMethod() {
        System.out.println("Đây là phương thức công khai (truy cập từ bất kỳ đâu)");
    }

    // Phương thức private chỉ có thể truy cập trong cùng một class
    private void privateMethod() {
        System.out.println("Đây là phương thức private (chỉ truy cập trong cùng một class)");
    }

    // Phương thức protected chỉ có thể truy cập trong cùng package hoặc subclass
    protected void protectedMethod() {
        System.out.println("Đây là phương thức protected (chỉ truy cập khi cùng package hoặc subclass)");
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        AccessExample example = new AccessExample();

        // Gọi phương thức public
        example.publicMethod();

        // Gọi phương thức private (sẽ bị lỗi nếu gọi từ ngoài class)
        // example.privateMethod(); // Sẽ báo lỗi nếu gọi từ class khác

        // Gọi phương thức protected (được phép trong cùng package hoặc subclass)
        example.protectedMethod();
    }
}
