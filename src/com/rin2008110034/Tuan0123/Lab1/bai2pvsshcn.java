package com.rin2008110034.Tuan0123.Lab1;
import java.util.Scanner;
public class bai2pvsshcn {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap Chieu Dai ");
        double chieuDai= scanner.nextDouble();
        System.out.print("Nhap Chieu rong");
        double chieuRong= scanner.nextDouble();
        double chuVi= (chieuDai+chieuRong)*2;
        System.out.println("Chu vi là "+chuVi);
        double dienTich= chieuDai*chieuRong;
        System.out.println("Dien tich la"+dienTich);
        double canhNho = Math.min(chieuDai,chieuRong);
        System.out.println("Canh nho la"+canhNho);

    }
}
