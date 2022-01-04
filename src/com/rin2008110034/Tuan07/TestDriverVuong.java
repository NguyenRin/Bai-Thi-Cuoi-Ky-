package com.rin2008110034.Tuan07;
import java.util.Scanner;
public class TestDriverVuong {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    HinhTamGiac HTG=new HinhTamGiac();
    HinhVuong HV = new HinhVuong();
    System.out.println("Nhập kích thước:");
    int s =sc.nextInt();
    HTG.setKichThuoc(s);
    System.out.println("Nhấp chuột:");
    boolean n =sc.nextBoolean();
    HTG.getNhapChuot(n);
   if( n= true){
        HTG.xoay(360);
        HV.getAmThanh();
    }
    else if(n=false){
        System.out.println("Bạn chưa nhấp chuột lên Circle");}
        
}
}
