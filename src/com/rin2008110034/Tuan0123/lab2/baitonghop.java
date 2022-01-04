package com.rin2008110034.Tuan0123.lab2;
import java.util.Scanner;
public class baitonghop {
    private static final int luaChon = 0;

    public static void main(String[] args) {
        do{
        Scanner scanner =new Scanner(System.in);
        System.out.print("______Menu______\n");
        System.out.print(">>1.Pt bac 1\n");
        System.out.print(">>2.PT bac 2\n");
        System.out.print(">>3.Tinh tien dien\n");
        System.out.print(">>4.Thoat\n");
        System.out.print("Nhap lua chon cua ban:\n");
        int luaChon= scanner.nextInt();
        switch(luaChon){
            case  1:{System.out.print("Nhap a");
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
                
            }};break;
            case 2:{
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
    
            }};break;
            case 3:System.out.print("Nhap so Ki dien");
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
        
        
            
                };break;
                case 4:break;
                default:System.out.print("Vui long nhap lai");}
        }
        while( luaChon>=1 && luaChon<=4);



    }
    
}
