package com.rin2008110034.Tuan05;

public class Nhanvien {
    String[] tenNV;
    long[] luong;
    char[] diaChi;
    char[] boPhanLamViec;
    String[] ngaySinh;

    void lamViec(){
        System.out.println("Nhân Viên:"+tenNV+"Đang làm việc tại bộ phận"+boPhanLamViec);
    }
    void kiemTraLuong(){
        System.out.println("Lương tháng này của nhân viên:"+tenNV+"là :"+luong+"VND");
    }
    void ktTraNhanVien(){
        System.out.println("Tên NV:"+tenNV);
        System.out.println("Ngày Sinh:"+ngaySinh);
        System.out.println("Địa chỉ:"+diaChi);
        System.out.println("Lương hiện tại"+luong+"1 Tháng");
        System.out.println("Bộ Phận đang làm:"+boPhanLamViec);
    }

    
}
