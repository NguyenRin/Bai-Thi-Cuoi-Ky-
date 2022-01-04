package com.rin2008110034.Tuan06;

    public class TestDriverTriangle {
        public static void main(String[] args) {
            Triangle triangle;
            triangle = new Triangle(true, 3, "lạch cạch lạch cạch ...");
            if(triangle.nhapChuotChua == true){
                triangle.xoay(360);
                triangle.phatAmThanh();
            }
            else
                System.out.println("Bạn chưa nhấp chuột lên Triangle");
        }
    }

