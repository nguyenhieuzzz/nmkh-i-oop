// Đổi tên class từ testSanPham thành TestSanPham
public class TestSanPham {
    public static void main(String[] args) {
        // Gọi constructor với 5 tham số: maSanPham, tenSanPham, loai, giaBan, trangThai
        SanPham sp = new SanPham("SP01", "Cà phê sữa", "Cà phê", 25000, true);
        System.out.println("Kết quả Test SanPham:");
        System.out.println(sp);
    }

    // Thêm một phương thức test tĩnh để có thể gọi từ App.java
    public static void test() {
        System.out.println("\n--- Chạy Test SanPham từ phương thức test() ---");
        SanPham sp = new SanPham("SP02", "Bánh mì", "Đồ ăn", 15000, true);
        System.out.println(sp);
    }
}

