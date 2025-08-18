package com.example.demo.model;

public class KhachHang {
    private String id;
    private String name;

    // Constructor khởi tạo đối tượng
    public KhachHang(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter và Setter để truy cập và chỉnh sửa dữ liệu
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
