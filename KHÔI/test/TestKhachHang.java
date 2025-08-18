// Đổi tên class từ testKhachHang thành TestKhachHang
public class TestKhachHang {
    public static void main(String[] args) {
        // Ví dụ tạo đối tượng KhachHang và in ra
        System.out.println("Kết quả Test KhachHang:");
        KhachHang kh = new KhachHang("KH001", "Nguyễn Văn A", "0912345678", "Vàng");
        System.out.println(kh);

        // Test các phương thức setter
        kh.setHangThanhVien("Bạch Kim");
        System.out.println("Cập nhật hạng thành viên: " + kh.getHangThanhVien());
    }

    // Thêm một phương thức test tĩnh để có thể gọi từ App.java
    public static void test() {
        System.out.println("\n--- Chạy Test KhachHang từ phương thức test() ---");
        KhachHang kh1 = new KhachHang("KH002", "Trần Thị B", "0987654321", "Bạc");
        System.out.println(kh1);
    }
}
