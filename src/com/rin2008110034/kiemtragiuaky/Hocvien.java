package com.rin2008110034.kiemtragiuaky;

public class Hocvien extends Nguoi {
    private float diemMonHoc1;
    private float diemMonHoc2;
    private int soLuongHocVien;
    Nguoi nguoi= new Nguoi();
    
    Hocvien(){}
    Hocvien(float d1,float d2){
        d1=diemMonHoc1;
        d2=diemMonHoc2;
        
    }
    public float getDiemMonHoc1() {
        return diemMonHoc1;
    }
    public void setDiemMonHoc1(float diemMonHoc1) {
        if(diemMonHoc1>0 && diemMonHoc1<=10){
        this.diemMonHoc1 = diemMonHoc1;
        }
        else 
        System.out.println("Nhập lại điểm môn học 1");
    }
    public float getDiemMonHoc2() {
        return diemMonHoc2;
    }
    public void setDiemMonHoc2(float diemMonHoc2) {
        if(diemMonHoc2>0 && diemMonHoc2<=10){
        this.diemMonHoc2 = diemMonHoc2;
        }
        else
        System.out.println("Nhập lại điểm môn học 2");
    }
    public int getSoLuongHocVien() {
        return soLuongHocVien;
    }
    public void setSoLuongHocVien(int soLuongHocVien) {
        this.soLuongHocVien = soLuongHocVien;
    }
}
