package com.rin2008110034.Tuan07;
import java.util.Scanner;
public class testdriverdongvat {
public static void main(String[] args) {
    dongvat dV=new dongvat();
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhập tuổi:");
    int t =sc.nextInt();
    dV.setTuoi(t);
    System.out.println("Nhập size:");
    int s=sc.nextInt();
    dV.setSize(s);
    dV.hanhDong();
    System.out.println("Tên loài:"+dV.getName());
    
}
}
