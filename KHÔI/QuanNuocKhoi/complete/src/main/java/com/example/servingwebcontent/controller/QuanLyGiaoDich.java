package com.example.servingwebcontent.controller;
import java.util.ArrayList;
import java.util.List;



public class QuanLyGiaoDich {
    private String maGiaoDich;
    private String maKhachHang;
    private List<QuanLySanPham> danhSachSanPham;

    // Constructor: Khởi tạo giao dịch với mã giao dịch và mã khách hàng
    public QuanLyGiaoDich(String maGiaoDich, String maKhachHang) {
        this.maGiaoDich = maGiaoDich;
        this.maKhachHang = maKhachHang;
        this.danhSachSanPham = new ArrayList<>();
    }

    // Getter cho mã giao dịch
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    // Getter cho mã khách hàng
    public String getMaKhachHang() {
        return maKhachHang;
    }

    // Getter cho danh sách sản phẩm
    public List<QuanLySanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    // Thêm một sản phẩm vào danh sách
    public void themSanPham(QuanLySanPham sp) {
        danhSachSanPham.add(sp);
    }

    // Xoá sản phẩm theo tên (không phân biệt hoa thường)
    public boolean xoaSanPham(String tenSP) {
        return danhSachSanPham.removeIf(sp -> sp.getTenSanPham().equalsIgnoreCase(tenSP));
    }

    // Sửa giá bán của sản phẩm theo tên (không phân biệt hoa, thường)
    public boolean suaGiaSanPham(String tenSP, double giaMoi) {
        for (QuanLySanPham sp : danhSachSanPham) {
            if (sp.getTenSanPham().equalsIgnoreCase(tenSP)) {
                sp.setGiaBan(giaMoi);
                return true;
            }
        }
        return false; 
    }

    // Tính tổng tiền của toàn bộ sản phẩm trong giao dịch
    public double getTongTien() {
        double tong = 0;
        for (QuanLySanPham sp : danhSachSanPham) {
            tong += sp.getGiaBan();
        }
        return tong;
    }

    // Trả về chuỗi mô tả chi tiết của giao dịch
    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", tongTien=" + getTongTien() +
                ", danhSachSanPham=" + danhSachSanPham +
                '}';
    }
}
