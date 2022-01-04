package com.rin2008110034.Tuan0123.lab3;
import java.util.Scanner;
public class bai1xetsont {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Nhap n:");
        double n= scanner.nextDouble();
        boolean ok=true;
        for(int i=2; i < n-1; i++){
            if(n%i==0){
                ok=false;
                break;
            }
            i++;
        }
        System.out.printf(" N=%.1f",n);
        System.out.print(" la so nguyen to "+ok);
    }
}
