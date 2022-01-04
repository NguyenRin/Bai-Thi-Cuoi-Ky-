package com.rin2008110034.Tuan0123.Lab1;
import java.util.Scanner;
public class bai4tinhdelta {
     public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
            System.out.print("Nhap a");
            double a= scanner.nextDouble();
            System.out.print("Nhap b");
            double b= scanner.nextDouble();
            System.out.print("Nhap c");
            double c= scanner.nextDouble();
            double delta=b*b-(4*a*c);
        System.out.printf("Delta=%.2f",delta);
        double cangDelta= Math.sqrt(delta);
        System.out.printf("Cang delta =%.2f",cangDelta);

    }
}
