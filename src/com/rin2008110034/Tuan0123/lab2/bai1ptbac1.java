package com.rin2008110034.Tuan0123.lab2;
import java.util.Scanner;
public class bai1ptbac1 {
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Nhap a");
    double a = scanner.nextDouble();
    System.out.print("Nhap b");
    double b = scanner.nextDouble();
    if(a==0)
    {
        if(b==0){
            System.out.printf("Pt vo so nghiem");
        }
        else{
            System.out.println("Pt vo nghiem");
        }
    }
    else
    {
            if(b==0){
                System.out.println("x=0");
            }
            else{
                double x= -b/a;
                System.out.println("="+x);
            }
        
    }

}
    
}
