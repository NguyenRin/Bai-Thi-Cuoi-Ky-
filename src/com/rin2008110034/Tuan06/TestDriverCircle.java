package com.rin2008110034.Tuan06;

    public class TestDriverCircle {
        public static void main(String[] args) {
            Circle circle;
            circle = new Circle(true, 2, "RÈ Rè RÈ");
            if(circle.nhapChuotChua == true){
                circle.xoay(360);
                circle.phatAmThanh();
            }
            else
                System.out.println("Bạn chưa nhấp chuột lên Circle");
        }
    }

