package com.example.servingwebcontent.database;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String loai;
    private double giaBan;
    private boolean trangThai; // true = đang bán, false = ngừng bán

    // Constructor mặc định
    public SanPham() {
    }

    // Constructor đầy đủ
    public SanPham(String maSanPham, String tenSanPham, String loai, double giaBan, boolean trangThai) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
    }

    // Getter & Setter
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", loai='" + loai + '\'' +
                ", giaBan=" + giaBan +
                ", trangThai=" + (trangThai ? "Đang bán" : "Ngừng bán") +
                '}';
    }
}

