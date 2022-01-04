package com.rin2008110034.Tuan04;
import java.util.Scanner;
import com.rin2008110034.Tuan04.MSSV2008110034.Khachhang1;
import com.rin2008110034.Tuan04.MSSV2008110034.NhanVien;
import com.rin2008110034.Tuan04.MSSV2008110034.TaiKhoan;
public class Main {
    private static final int luaChon = 0;

    public static void main(String[] args) {
        NhanVien nV =new NhanVien();
        Khachhang1 kH=new Khachhang1();
        TaiKhoan tK=new TaiKhoan();
    Scanner scanner=new Scanner(System.in);
    do{
    System.out.println("---Chào Mừng bạn đến với ngân hàng---");
    System.out.println("Bạn là:");
    System.out.println(">>1.Nhân Viên");
    System.out.println(">>2.Khách Hàng");
    System.out.println("Nhập lựa chọn");
    int luaChon=scanner.nextInt();
    switch(luaChon){
        case 1:
            System.out.println("Nhập mã nhân viên");
            int a =scanner.nextInt();
        if(a==nV.maNV){
            System.out.println(">>1.Xem danh sách khách hàng");
            System.out.println(">>2.Xem lương của NV");
            System.out.println("Nhập lựa chọn:");
            int luaChonNV=scanner.nextInt();
        switch(luaChonNV){
            case 1:
                kH.tenKhachHang();
                kH.soTaiKhoan();
                kH.soDuKH();
            break;
            case 2:
                nV.tenNhanVien();
                nV.luongNV();
            break;
            default:System.out.println("Vui lòng nhập lại");
        } 
                }  
        else{
            System.out.println("Bạn nhập sai mã nv");
        }      
        break;   
        case 2: 
            System.out.println("Nhập số TK khách hàng:");
            int b= scanner.nextInt();
            if(b==kH.account_number){
                System.out.println(">>1.Rút tiền");
                System.out.println(">>2.Gửi tiền");
                System.out.println(">>3.Xem số dư");
                System.out.println("Nhập lựa chọn");
                int luaChonKH=scanner.nextInt();
                switch(luaChonKH){
                    case 1:
                    System.out.println("Nhập số tiền cần rút");
                    double amount=scanner.nextDouble();
                    tK.withdraw(amount);
                    System.out.println("Bạn đã rút"+amount+"Ra khỏi tài khoản"+kH.account_number);
                    break;
                    case 2:
                    System.out.println("Nhập số tiền cần rút");
                    double amount1=scanner.nextDouble();
                    tK.deposite(amount1);
                    System.out.println("Bạn đã gửi"+amount1+"Vào khỏi tài khoản"+kH.account_number);
                    break;
                    case 3:
                    tK.showData();
                    break;
                    default:System.out.println("Vui lòng nhập lại");
                }   
            }
            else {
                System.out.println("Bạn nhập sai số Tài Khoản");
            }

            }
        }
        while(luaChon<=2 && luaChon>=0);
    }

}   
    

