package com.rin2008110034.Tuan05;
import java.util.Scanner;
public class TestDriveCow {


    private static int luaChonBo;

    public static void main(String[] args) {
        Cow  c=new Cow();
        int soPhanTu=5;
        int viTri;
        String loaiMoi;
        long weightMoi;
        Scanner sc= new Scanner(System.in);
        do
        {
        System.out.println("=== BÒ ===");
        System.out.println(">>1.Nhập loài và cân nặng");
        System.out.println(">>2.Xuất danh sách bò");
        System.out.println(">>3.Thêm loài mới");
        System.out.println(">>4.Sửa loài có sẵn");
        System.out.println(">>5.Xóa loài có sẵn");
        System.out.println(">>6.Sắp xếp theo cân nặng");
        System.out.println(">>7.Hành động ăn ");
        System.out.println(">>8.Hành động ngủ");
        System.out.println("Nhập lựa chọn:");
        int luaChonBo = sc.nextInt();
        switch(luaChonBo)
        {
            case 1:
            c.nhapLoai();
            break;
            case 2:
            for(int i=0;i<soPhanTu;i++)
            {
            System.out.println("Loài:"+i+"\n"+c.loai[i]+ "\nCân nặng:"+c.weight[i]);
            }
            break;
            case 3:
            System.out.println("Nhập loài muốn thêm:");
            loaiMoi =sc.next();
            System.out.println("Nhập cân nặng:");
            weightMoi=sc.nextLong();
            System.out.println("Vị trí muốn thêm:");
            viTri=sc.nextInt();
            for(int i =soPhanTu;i>viTri;i--){
                c.loai[i] = c.loai[i-1];
            }
            c.loai[viTri]=loaiMoi;
            for(int i=soPhanTu;i>viTri;i--){
                c.weight[i]=c.weight[i-1];

            }
            c.weight[viTri]=weightMoi;
            break;
            case 4:
            System.out.println(">>1.Sửa tên loài:");
            System.out.println(">>2.Sửa cân nặng:");
            System.out.println("Lựa chọn");
            int chon=sc.nextInt();
            switch(chon){
                case 1:
                System.out.println("Nhập vị trí muốn sửa:");
                int viTriMoi=sc.nextInt();
                if(viTriMoi<0||viTriMoi>soPhanTu){
                    System.out.println("Không có vị trí này trong danh sách");
                }
                else{
                    System.out.println("Nhập Tên mới:");
                    String tenMoi=sc.next();
                    c.loai[viTriMoi]=tenMoi;
                }
                break;
                case 2:
                System.out.println("Nhập vị trí muốn sửa:");
                int viTriNew=sc.nextInt();
                if(viTriNew<0||viTriNew>soPhanTu){
                    System.out.println("Không có vị trí này trong danh sách");
                }
                else{
                    System.out.println("Nhập Tên mới:");
                     weightMoi=sc.nextLong();
                    c.weight[viTriNew]=weightMoi;
                }
                break;
                default:
                System.out.println("Vui lòng nhập lại:");
            }
            break;
            case 5:
            System.out.println("Nhập vị trí cần xóa:");
            int viTriXoa=sc.nextInt();
            for(int i=viTriXoa;i<c.loai.length-1;i++){
                c.loai[i]=c.loai[i+1];
            }
            for(int i=viTriXoa;i<c.weight.length-1;i++){
                c.weight[i]=c.weight[i+1];
            }
            break;
            case 6:
            break;
            case 7:
            c.hanhDongAn();
            break;
            case 8:
            c.hanhDongNgu();
            break;

            
        }
        }while( luaChonBo>=0 || luaChonBo<=8);
        
    }
    
}
