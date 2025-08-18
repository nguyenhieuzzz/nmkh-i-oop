public class TestGiaoDich { // Đổi tên class từ testGiaoDich thành TestGiaoDich
    public static void main(String[] args) {
        System.out.println("Kết quả Test GiaoDich:");

        // Tạo đối tượng SanPham sử dụng constructor 
        SanPham sp1 = new SanPham("SP03", "Cà phê đen", "Đồ uống", 20000, true);
        SanPham sp2 = new SanPham("SP04", "Bánh ngọt", "Đồ ăn", 30000, true);

        // Tạo đối tượng GiaoDich.
        
        GiaoDich gd = new GiaoDich("GD001", "KH001"); // Giả sử "KH001" là mã khách hàng

        gd.themSanPham(sp1);
        gd.themSanPham(sp2);

        // In ra thông tin giao dịch và tổng tiền
        System.out.println(gd); // toString của GiaoDich đã in tổng tiền

        
        System.out.println("Tổng tiền của giao dịch GD001: " + gd.getTongTien() + " VND");

        // Test xóa sản phẩm
        gd.xoaSanPham("Bánh ngọt");
        System.out.println("Sau khi xóa Bánh ngọt:");
        System.out.println(gd);
        System.out.println("Tổng tiền sau khi xóa: " + gd.getTongTien() + " VND");
    }

    
    public static void test() {
        System.out.println("\n--- Chạy Test GiaoDich từ phương thức test() ---");
        SanPham spA = new SanPham("SP05", "Trà sữa", "Đồ uống", 35000, true);
        GiaoDich gd2 = new GiaoDich("GD002", "KH002");
        gd2.themSanPham(spA);
        System.out.println(gd2);
        System.out.println("Tổng tiền của giao dịch GD002: " + gd2.getTongTien() + " VND");
    }
}
