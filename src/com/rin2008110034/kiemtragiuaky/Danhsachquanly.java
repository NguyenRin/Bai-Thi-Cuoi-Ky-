package com.rin2008110034.kiemtragiuaky;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Danhsachquanly {
        private ArrayList<Hocvien> danhSachHV;
        private ArrayList<Nhanvien> danhSachNV;
        private ArrayList<Khachhang> danhSachKH;
        public void DanhSachHocVien(){
            danhSachHV =new ArrayList<Hocvien>();
        }
        public void DanhSachNhanVien(){
            danhSachNV =new ArrayList<Nhanvien>();
        }
        public void DanhSachKhachHang(){
            danhSachKH =new ArrayList<Khachhang>();
        }
        Scanner sc=new Scanner(System.in);
        void themNhanVien(Nhanvien nhanvien){
            danhSachNV.add(nhanvien);
            }
    
        void themHocVien(Hocvien hV){
            danhSachHV.add(hV);
            }
        
        void themKhachHang(Khachhang kH){
            danhSachKH.add(kH);
            }
        void inDanhSachHocVien(){
            for( Hocvien hocvien :danhSachHV){
                System.out.println(hocvien);
            }
        }
        void inDanhSachNhanVien(){
            for( Nhanvien nhanvien :danhSachNV){
                System.out.println(nhanvien);
            }
        }
        void inDanhSachKhachHang(){
            for( Khachhang khachhang :danhSachKH){
                System.out.println(khachhang);
            }
        }
    }
    

