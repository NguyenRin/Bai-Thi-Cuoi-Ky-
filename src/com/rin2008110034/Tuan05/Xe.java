package com.rin2008110034.Tuan05;

public class Xe {
    String[] hang= new String[5];
    String[] mau= new String[5];
    long[] tocDo= new long[5];
    long[] dungTichXang= new long[5];
    String[] giayPhep= new String[5];
    String[] tenChuXe= new String[5];
    

    void khoiDong(){
        System.out.println("Xe đang khởi động");
    }

    void chay(){
        for(int i=0;i<5;i++){

        System.out.println("Xe đang chạy với vận tốc:"+tocDo[i]+"KM/H");
        }
    }
    void dungLai(){
        System.out.println("Xe đang dừng lại tốc độ: 0 KM/H");
    }
    void kiemTraXe(){
        for(int i=0;i<5;i++){
        System.out.println("Xe được sản xuất tại hãng:"+hang[i]);
        System.out.println("Tên chủ sở hữu:"+tenChuXe[i]);
        System.out.println("Màu xe"+mau[i]);
        System.out.println("Dung Tích xăng:"+dungTichXang[i]);
        System.out.println("Giấy phép:"+giayPhep[i]);
        }
    }
    
}
