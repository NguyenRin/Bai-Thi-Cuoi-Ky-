package com.rin2008110034.Tuan04.MSSV2008110034;
import java.util.Scanner;
public class Khachhang1 {

    
    
    Scanner scanner=new Scanner(System.in);
    
    public long account_number = 1235;
    public double account_balance = 1000000;
    public String ten="Nguyễn Văn B";

    public void tenKhachHang(){
        System.out.println("Tên Khách Hàng:"+ten);
    }
    public void soDuKH(){
        System.out.println("Số Dư:"+account_balance);

    }
    public void soTaiKhoan(){
        System.out.println("Số TK:"+account_number);
    }


    
}
