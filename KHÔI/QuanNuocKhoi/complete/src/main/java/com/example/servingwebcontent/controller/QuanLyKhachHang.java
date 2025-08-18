package com.example.servingwebcontent.controller;
public class QuanLyKhachHang {
    //  Thuộc tính (được đóng gói)
    private String maKhachHang;
    private String hoTen;
    private String soDienThoai;
    private String hangThanhVien;

    //  Hàm tạo (Constructor)
    public QuanLyKhachHang(String ma, String ten, String sdt, String hang) {
        maKhachHang = ma;
        hoTen = ten;
        soDienThoai = sdt;
        hangThanhVien = hang;
    }

    //  Các phương thức getter
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getHangThanhVien() {
        return hangThanhVien;
    }

    //  Các phương thức setter
    public void setHoTen(String ten) {
        hoTen = ten;
    }

    public void setSoDienThoai(String sdt) {
        soDienThoai = sdt;
    }

    public void setHangThanhVien(String hang) {
        hangThanhVien = hang;
    }

    //  In thông tin khách hàng
    @Override
    public String toString() {
        return "Khách hàng: " + hoTen + " (" + maKhachHang + "), SĐT: " + soDienThoai + ", Hạng: " + hangThanhVien;
    }
}
