package com.rin2008110034.Tuan0123.lab3;
import java.util.Scanner;
public class bai2xuatbancuuchuong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Chay den ban cuu chuong so:");
        int x=scanner.nextInt();
        for(int i =1;i<=x;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d", i,j,j*i);
                System.out.println();
            }
        }
    }
    
}
