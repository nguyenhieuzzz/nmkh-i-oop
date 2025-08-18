package com.example.servingwebcontent.database;

import java.util.ArrayList;
import java.util.List;

public class GiaoDich {
    private String maGiaoDich;
    private String maKhachHang;
    private List<SanPham> danhSachSanPham;

    // Constructor mặc định
    public GiaoDich() {
        this.danhSachSanPham = new ArrayList<>();
    }

    // Constructor đầy đủ
    public GiaoDich(String maGiaoDich, String maKhachHang) {
        this.maGiaoDich = maGiaoDich;
        this.maKhachHang = maKhachHang;
        this.danhSachSanPham = new ArrayList<>();
    }

    // Getter & Setter
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }

    // Thêm sản phẩm
    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
    }

    // Xóa sản phẩm theo tên
    public boolean xoaSanPham(String tenSP) {
        return danhSachSanPham.removeIf(sp -> sp.getTenSanPham().equalsIgnoreCase(tenSP));
    }

    // Sửa giá sản phẩm
    public boolean suaGiaSanPham(String tenSP, double giaMoi) {
        for (SanPham sp : danhSachSanPham) {
            if (sp.getTenSanPham().equalsIgnoreCase(tenSP)) {
                sp.setGiaBan(giaMoi);
                return true;
            }
        }
        return false;
    }

    // Tính tổng tiền
    public double getTongTien() {
        double tong = 0;
        for (SanPham sp : danhSachSanPham) {
            tong += sp.getGiaBan();
        }
        return tong;
    }

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

