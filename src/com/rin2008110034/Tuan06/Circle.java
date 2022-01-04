package com.rin2008110034.Tuan06;

    public class Circle {
        //attribute
        boolean nhapChuotChua;
        int kichThuoc;
        String amThanh;
        //method
        //hàm tạo 3 tham số
        Circle(boolean a, int b, String c){
            nhapChuotChua = a;
            kichThuoc = b;
            amThanh = c;
        }
        void xoay(int d){
            System.out.print("Xoay hình Circle theo chiều kim đồng hồ "+d);
            System.out.println(" độ");
            System.out.println("Kích thước của hình sau khi xoay không thay đổi, kích thước = "+kichThuoc);
        }
        void phatAmThanh(){
            System.out.println("Âm thanh phát ra: "+amThanh);
        }
   }
   

