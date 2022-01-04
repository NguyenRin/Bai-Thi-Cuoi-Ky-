package com.rin2008110034.Tuan0123.lab2;
import java.util.Scanner;
public class bai2ptbac2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap a");
        double a= scanner.nextDouble();
        System.out.print("Nhap b");
        double b= scanner.nextDouble();
        System.out.print("Nhap c");
        double c= scanner.nextDouble();
        double delta= Math.pow(b, 2)-4*a*c;
        if(delta<0){
            if(delta==0){
                double x=-b/(2*a);
                System.out.println("Pt co nghiem kep"+x);

            }
            else{
                System.out.println("Pt vo nghiem");
            }
        }
        else{
            double x1=-b+Math.sqrt(delta)/(2*a);
            double x2=-b-Math.sqrt(delta)/(2*a);
            System.out.printf("Phuong trinh co 2 nghiem x1=%.2f,x2=%.2f", x1,x2);

        }

    }
}
