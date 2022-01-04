package com.rin2008110034.Tuan05;
import java.util.Scanner;
public class TestDriveXe {
    private static int luaChonXe;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Xe x =new Xe();
        x.hang[1]="Ferari";
        x.hang[2]="Lambogini";
        x.mau[1]="Nâu";
        x.mau[2]="Đỏ";
        x.tocDo[1]=400;
        x.tocDo[2]=350;
        x.dungTichXang[1]=78;
        x.dungTichXang[2]=80;
        x.giayPhep[1]="có";
        x.giayPhep[2]="Không";
        x.tenChuXe[1]="Nguyễn Văn A";
        x.tenChuXe[2]="Nguyễn Văn B";
        
        do
        {
        System.out.println("=== Xe ===");
        System.out.println(">>1.Nhập loại xe ");
        System.out.println(">>2.Xuất danh sách xe");
        System.out.println(">>3.Thêm loại xe mới");
        System.out.println(">>4.Sửa loại xe có sẵn");
        System.out.println(">>5.Xóa loại xe có sẵn");
        System.out.println(">>6.Sắp xếp theo giá nặng");
        System.out.println(">>7.Hành động khởi động ");
        System.out.println(">>8.Hành động chạy");
        System.out.println(">>9.Dừng lại");
        System.out.println("           ");
        System.out.println("Nhập lựa chọn:");
        int luaChonXe = sc.nextInt();
        switch(luaChonXe){
            case 1:
            System.out.println("Nhập vị trí muốn thêm:");
            int viTriXe =sc.nextInt();
            System.out.println("Nhập số lượng muốn thêm");
            int soLuongThem=sc.nextInt();
            for(int i=viTriXe;i<viTriXe+soLuongThem;i++){
                System.out.println("Nhập tên vị trí thứ:"+i);
                x.tenChuXe[i]=sc.next();
                System.out.println("Nhập hãng vị trí thứ:"+i);
                x.hang[i]=sc.next();
                System.out.println("Nhập Màu vị trí thứ:"+i);
                x.mau[i]=sc.next();
                System.out.println("Nhập Tốc độ vị trí thứ:"+i);
                x.tocDo[i]=sc.nextLong();
                System.out.println("Nhập dung tích xăng vị trí thứ:"+i);
                x.dungTichXang[i]=sc.nextLong();
                System.out.println("Nhập giấy phép vị trí thứ:"+i);
                x.giayPhep[i]=sc.next();
                System.out.println("           ");

            }
            break;
            case 2:
            for(int i=0;i<5;i++){
            System.out.println("Mặt hàng thứ:"+i);
            System.out.println("Hãng:"+x.hang[i]);
            System.out.println("Màu"+x.mau[i]);
            System.out.println("Tốc độ:"+x.tocDo[i]+"KM/H");
            System.out.println("Dung tích:"+x.dungTichXang[i]);
            System.out.println("           ");
            }
            break;
            case 3:
            System.out.println("Nhập vị trí muốn thêm");
            int viTriThem=sc.nextInt();
            System.out.println("Nhập dữ liệu cần thêm");
            System.out.println("Hãng");
            String hangNew=sc.next();
            System.out.println("Màu");
            String mauNew=sc.next();
            System.out.println("Tốc độ");
            long tocDoNew=sc.nextLong();
            System.out.println("Tên Chủ xe");
            String tenNew=sc.next();
            System.out.println("Giấy phép");
            String giayPhepNew=sc.next();
            System.out.println("Dung tích xăng");
            long dungTichNew=sc.nextLong();
            for(int i=5;i>viTriThem;i--){
                x.hang[i]=x.hang[i-1];
            }
        }
        }
        while(luaChonXe>=0|| luaChonXe<=9);












    }
    
}
