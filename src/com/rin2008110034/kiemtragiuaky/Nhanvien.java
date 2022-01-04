package com.rin2008110034.kiemtragiuaky;

public class Nhanvien extends Nguoi{
    private double heSoLuong;


    Nhanvien(){
    }
    Nhanvien(double hSl){
        hSl=heSoLuong;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        if(heSoLuong>0){
        this.heSoLuong = heSoLuong;
        }
        else
        System.out.println("Nhập lại hệ số lương");
    }
}
