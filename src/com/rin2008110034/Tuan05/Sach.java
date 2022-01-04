package com.rin2008110034.Tuan05;
import java.util.Scanner;
public class Sach {
    String[] ten;
    int[] soTrang;
    long[] ngaySanXuat;
    Scanner sc=new Scanner(System.in);

    void moSach(){
        System.out.println("Mở đầu");
        System.out.println("Tên sách:"+ten);
        System.out.println("Ngày viết:"+ngaySanXuat);
        System.out.println("Số Trang:"+soTrang);

    }
    void latSach(){
        System.out.println("Nhập số trang muốn lật");
        int trang= sc.nextInt();
        for(int i=0;i<trang;i++){
            System.out.println("Bạn đang lật tới trang"+i);
        }
    }
    
    
    
}
