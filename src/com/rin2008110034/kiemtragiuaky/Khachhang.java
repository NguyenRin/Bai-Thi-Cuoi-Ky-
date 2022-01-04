package com.rin2008110034.kiemtragiuaky;

public class Khachhang extends Nguoi {
    private String tenCongTy;
    private double triGiaHoaDon;



    Khachhang(){}
    Khachhang(String tCt,double t){
        tCt =tenCongTy;
        t=triGiaHoaDon;
    }
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTenCongTy(String tenCongTy) {
        
        this.tenCongTy = tenCongTy;
    }
    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }
    public void setTriGiaHoaDon(double triGiaHoaDon) {
        if(triGiaHoaDon>0){
        this.triGiaHoaDon = triGiaHoaDon;
        }
        else
        System.out.println("Nhập sai Trị giá hóa đơn");
    }
}
