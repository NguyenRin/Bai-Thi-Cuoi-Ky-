package com.rin2008110034.Tuan0123.Lab1;
import java.util.Scanner;
public class bai3canhlapphuong {
    public static void  main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap canh lp");
        double canh= scanner.nextDouble();
        double theTich= Math.pow(canh, 3);
        System.out.println("The tich la " +theTich);
        
    }
}
