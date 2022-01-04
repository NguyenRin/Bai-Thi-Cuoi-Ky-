package com.rin2008110034.kiemtragiuaky;
import java.util.Scanner;
public class TestDriverquanly {
    

    private static final int luaChon = 0;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Danhsachquanly dSQL= new Danhsachquanly();
       int luaChon =0;
      
      
        do{
            System.out.println("Menu");
            System.out.println(">>1.Nhập sinh viên");
            System.out.println(">>2.Nhập nhân viên");
            System.out.println(">>3.Nhập khách hàng");
            System.out.println(">>4.Xuất danh sách SV");
            System.out.println(">>5.Xuất danh sách NV");
            System.out.println(">>6.Xuất danh sách KH");
            System.out.println(">>7.Thêm NV");
            System.out.println(">>8.Thêm SV");
            System.out.println(">>9.Thêm KH");
            System.out.println(">>10.Thoát");
            System.out.println("Nhập lựa chọn");
             luaChon= sc.nextInt();
            switch(luaChon){
                case 1:System.out.println("Nhập họ tên Sinh Viên");
                        String hoTen=sc.next();
                        System.out.println("Nhập điểm môn 1");
                        float diem1=sc.nextFloat();
                        System.out.println("Nhập điểm môn 2");
                        float diem2=sc.nextFloat();
                        System.out.println("Nhập địa chỉ");
                        String diaChi=sc.next();
                        Hocvien hV=new Hocvien(diem1,diem2);
                        Nguoi nG =new Nguoi(hoTen,diaChi);
                        dSQL.themHocVien(hV);
                        break;
                case 2:System.out.println("Nhập họ tên Nhân viên");
                String hoTenNV=sc.next();
                System.out.println("Nhập hệ số lương");
                double hsL=sc.nextDouble();
                System.out.println("Nhập địa chỉ");
                String diaChiNV=sc.next();
                Nhanvien nV=new Nhanvien(hsL);
                Nguoi ng = new Nguoi(hoTenNV,diaChiNV);
                dSQL.themNhanVien(nV);
                break;
            case 3:
            System.out.println("Nhập họ tên Khách Hàng");
                String hoTenKH=sc.next();
                System.out.println("Nhập Trị giá hóa đơn");
                double triGia=sc.nextDouble();
                System.out.println("Nhập địa chỉ");
                String diaChiKH=sc.next();
                System.out.println("Nhập Tên công ty");
                String tenCT=sc.next();
            Khachhang kH =new Khachhang(tenCT,triGia);
            Nguoi nguoi = new Nguoi(hoTenKH,diaChiKH);
            dSQL.themKhachHang(kH);
            break;
            case 4:
            dSQL.DanhSachHocVien();break;
            case 5:
            dSQL.DanhSachNhanVien();break;
            case 6:
            dSQL.DanhSachKhachHang();break;
            case 10:
            System.out.println("Thoát");break;
            }
        }while(luaChon>0 && luaChon<=10);
    }
    
}
