package com.rin2008110034.Tuan0123.Lab1;
import java.util.Scanner;
public class bai1hotendtb {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ho va ten:");

        String hoTen= scanner.nextLine();
        System.out.print("Nhap diem trung binh:");
        double diemTB= scanner.nextDouble();
        System.out.printf("%s %.2f diem ",hoTen,diemTB);
    }
}
