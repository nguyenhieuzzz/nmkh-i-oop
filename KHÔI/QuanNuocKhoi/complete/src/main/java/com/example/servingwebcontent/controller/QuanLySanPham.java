package com.example.servingwebcontent.controller;
public class QuanLySanPham {
    private String maSanPham; 
    private String tenSanPham;
    private String loai;
    private double giaBan;
    private boolean trangThai;

    public QuanLySanPham(String maSanPham, String tenSanPham, String loai, double giaBan, boolean trangThai) { // Cập nhật constructor
        this.maSanPham = maSanPham; 
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
    }

    // Getters cho maSanPham
    public String getMaSanPham() {
        return maSanPham;
    }

    // Setters cho maSanPham 
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    // Getters còn lại (giữ nguyên)
    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getLoai() {
        return loai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    // Setters còn lại (giữ nguyên)
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        // Cập nhật toString để hiển thị mã sản phẩm
        return "Mã SP: " + maSanPham + ", Tên SP: " + tenSanPham + " - " + loai + ": " + giaBan + " VND (" + (trangThai ? "Đang bán" : "Ngừng bán") + ")";
    }
}