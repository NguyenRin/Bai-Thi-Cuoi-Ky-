package com.rin2008110034.Tuan0123.lab2;
import java.util.Scanner;
public class bai3tinhtiendien {
    public static void main(String[] args) {
        
    Scanner scanner=  new Scanner(System.in);
    System.out.print("Nhap so Ki dien");
    double kiDien= scanner.nextDouble();
    if(kiDien<50)
        {
        
        double tienDien=kiDien*1000;
        System.out.printf("So tien Dien cua ban:%.2f", tienDien);
        }
    else
        {
        if(kiDien>50)
            {
            double tienDien=50*1000+(kiDien-50)*1200;
        System.out.printf("So tien Dien cua ban:%.2f", tienDien);
           }
        else
        {
        System.out.print("Nhap sai so dien vui long nhap lai");
        }


    
        }
    }
}
