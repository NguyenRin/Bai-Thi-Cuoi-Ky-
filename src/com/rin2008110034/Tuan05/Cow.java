package com.rin2008110034.Tuan05;
import java.util.Scanner;
public class Cow {
    Scanner scanner=new Scanner(System.in);
    public String[] loai = new String[20];
    
    public long[] weight =new long[100];
    
  
    void nhapLoai(){
        System.out.println("Nhập số loài :");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhập loài"+i);
            loai[i]=scanner.next();
        }
        for(int i=0;i<n;i++){
            System.out.println("Nhập cân nặng loài:"+i);
            weight[i]=scanner.nextLong();
        }
        
        
    }
    void hanhDongAn(){
        System.out.println("Loài Vật này đang ăn");
    }
    void hanhDongNgu(){
        System.out.println("Loài vật này đang ngủ");
    }
}
