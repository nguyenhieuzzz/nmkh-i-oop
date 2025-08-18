package com.example.servingwebcontent.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Lớp này sẽ quản lý thao tác với bảng KhachHang, SanPham, GiaoDich
public class InternetCafeConnection {

    private Connection conn;

    public InternetCafeConnection() {
        conn = DBConnection.getConnection();
    }

    // Thêm khách hàng
    public void themKhachHang(String ten, String sdt) {
        String sql = "INSERT INTO khachhang (ten, sdt) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ten);
            ps.setString(2, sdt);
            ps.executeUpdate();
            System.out.println("Thêm khách hàng thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Thêm sản phẩm
    public void themSanPham(String ten, double gia) {
        String sql = "INSERT INTO sanpham (ten, gia) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ten);
            ps.setDouble(2, gia);
            ps.executeUpdate();
            System.out.println("Thêm sản phẩm thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Ghi nhận giao dịch
    public void taoGiaoDich(int idKhachHang, int idSanPham, int soLuong) {
        String sql = "INSERT INTO giaodich (id_khachhang, id_sanpham, soluong) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idKhachHang);
            ps.setInt(2, idSanPham);
            ps.setInt(3, soLuong);
            ps.executeUpdate();
            System.out.println("Giao dịch đã được tạo!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Hiển thị toàn bộ giao dịch
    public void hienThiGiaoDich() {
        String sql = "SELECT g.id, k.ten AS ten_khach, s.ten AS ten_sp, g.soluong " +
                     "FROM giaodich g " +
                     "JOIN khachhang k ON g.id_khachhang = k.id " +
                     "JOIN sanpham s ON g.id_sanpham = s.id";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Giao dịch #" + rs.getInt("id") + ": " +
                        rs.getString("ten_khach") + " mua " +
                        rs.getString("ten_sp") + " x" + rs.getInt("soluong"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
