package com.example.servingwebcontent.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanNuocKhoiController {
    private static List<QuanLySanPham> menu = new ArrayList<>();
    private static List<QuanLyKhachHang> dsKhachHang = new ArrayList<>();
    private static List<QuanLyGiaoDich> dsGiaoDich = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void test() {
        khoiTaoDuLieuMau();
        
        while (true) {
            System.out.println("\n=== QUẢN LÝ QUÁN NƯỚC CỦA KHÔI ===");
            System.out.println("1. Quản lý sản phẩm");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Tạo giao dịch mới");
            System.out.println("4. Xem tất cả giao dịch");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            
            int chon = sc.nextInt();
            sc.nextLine(); 
            
            switch (chon) {
                case 1:
                    quanLySanPham();
                    break;
                case 2:
                    quanLyKhachHang();
                    break;
                case 3:
                    taoGiaoDich();
                    break;
                case 4:
                    xemTatCaGiaoDich();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void khoiTaoDuLieuMau() {
        menu.add(new QuanLySanPham("CF01", "Cafe Đen", "Đồ uống", 20000, true));
        menu.add(new QuanLySanPham("CF02", "Cafe Sữa", "Đồ uống", 25000, true));
        dsKhachHang.add(new QuanLyKhachHang("KH01", "Nguyễn Văn A", "0912345678", "Vàng"));
    }

    private static void quanLySanPham() {
        System.out.println("\n=== QUẢN LÝ SẢN PHẨM ===");
        System.out.println("1. Thêm sản phẩm mới");
        System.out.println("2. Hiển thị menu");
        System.out.print("Chọn: ");
        
        int chon = sc.nextInt();
        sc.nextLine();
        
        if (chon == 1) {
            System.out.print("Nhập mã SP: ");
            String maSP = sc.nextLine();
            
            System.out.print("Nhập tên SP: ");
            String tenSP = sc.nextLine();
            
            System.out.print("Nhập loại SP: ");
            String loai = sc.nextLine();
            
            System.out.print("Nhập giá bán: ");
            double gia = sc.nextDouble();
            
            menu.add(new QuanLySanPham(maSP, tenSP, loai, gia, true));
            System.out.println("Đã thêm sản phẩm thành công!");
        } else {
            System.out.println("\n=== MENU HIỆN CÓ ===");
            menu.forEach(System.out::println);
        }
    }

    private static void quanLyKhachHang() {
        System.out.println("\n=== QUẢN LÝ KHÁCH HÀNG ===");
        System.out.println("1. Thêm khách hàng mới");
        System.out.println("2. Tìm khách hàng theo SĐT");
        System.out.print("Chọn: ");
        
        int chon = sc.nextInt();
        sc.nextLine();
        
        if (chon == 1) {
            System.out.print("Nhập mã KH: ");
            String maKH = sc.nextLine();
            
            System.out.print("Nhập tên KH: ");
            String tenKH = sc.nextLine();
            
            System.out.print("Nhập SĐT: ");
            String sdt = sc.nextLine();
            
            System.out.print("Nhập hạng thành viên: ");
            String hang = sc.nextLine();
            
            dsKhachHang.add(new QuanLyKhachHang(maKH, tenKH, sdt, hang));
            System.out.println("Đã thêm khách hàng thành công!");
        } else {
            System.out.print("Nhập SĐT cần tìm: ");
            String sdt = sc.nextLine();
            
            dsKhachHang.stream()
                .filter(kh -> kh.getSoDienThoai().equals(sdt))
                .findFirst()
                .ifPresentOrElse(
                    kh -> System.out.println("Thông tin KH: " + kh),
                    () -> System.out.println("Không tìm thấy KH với SĐT: " + sdt)
                );
        }
    }

    private static void taoGiaoDich() {
        System.out.println("\n=== TẠO GIAO DỊCH MỚI ===");
        
        System.out.println("Danh sách khách hàng:");
        dsKhachHang.forEach(kh -> System.out.println(kh.getMaKhachHang() + " - " + kh.getHoTen()));
        
        System.out.print("Chọn mã KH: ");
        String maKH = sc.nextLine();
        
        System.out.print("Nhập mã giao dịch: ");
        String maGD = sc.nextLine();
        
        QuanLyGiaoDich gd = new QuanLyGiaoDich(maGD, maKH);
        
        while (true) {
            System.out.println("\n=== MENU ===");
            menu.forEach(sp -> {
                if (sp.isTrangThai()) {
                    System.out.println(sp);
                }
            });
            
            System.out.print("Nhập mã SP muốn thêm (hoặc 'done' để kết thúc): ");
            String maSP = sc.nextLine();
            
            if (maSP.equalsIgnoreCase("done")) break;
            
            menu.stream()
                .filter(sp -> sp.getMaSanPham().equals(maSP) && sp.isTrangThai())
                .findFirst()
                .ifPresentOrElse(
                    sp -> {
                        gd.themSanPham(sp);
                        System.out.println("Đã thêm " + sp.getTenSanPham() + " vào giao dịch");
                    },
                    () -> System.out.println("Không tìm thấy SP hoặc SP đã ngừng bán")
                );
        }
        
        dsGiaoDich.add(gd);
        System.out.println("Đã tạo giao dịch thành công!");
        System.out.println("Tổng tiền: " + gd.getTongTien() + " VND");
    }

    private static void xemTatCaGiaoDich() {
        System.out.println("\n=== DANH SÁCH GIAO DỊCH ===");
        if (dsGiaoDich.isEmpty()) {
            System.out.println("Chưa có giao dịch nào!");
        } else {
            dsGiaoDich.forEach(gd -> {
                System.out.println("\nMã GD: " + gd.getMaGiaoDich());
                System.out.println("Khách hàng: " + gd.getMaKhachHang());
                System.out.println("Chi tiết đơn hàng:");
                gd.getDanhSachSanPham().forEach(sp -> 
                    System.out.println(" - " + sp.getTenSanPham() + ": " + sp.getGiaBan() + " VND")
                );
                System.out.println("Tổng cộng: " + gd.getTongTien() + " VND");
            });
        }
    }
}
