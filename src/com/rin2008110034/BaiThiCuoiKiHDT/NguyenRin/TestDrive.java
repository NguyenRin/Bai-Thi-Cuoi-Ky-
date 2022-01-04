package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.ParseException;
import java.util.Scanner;
public class TestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon = -1;
        Scanner bienNhap = new Scanner(System.in);
        DanhSachQuanLi dS = new DanhSachQuanLi();
        //TẠO ĐỐI TƯỢNG HÀNG THỰC PHẨM
        HangHoa sp1 = new HangThucPham("01", "Rau Cai", 16500 ,1231, "22/11/2021","25/11/2021");
        HangHoa sp2 = new HangThucPham("02", "Ca Chim", 180000 ,893, "29/12/2022","01/01/2023");
        HangHoa sp3 = new HangThucPham("03", "Thit Baroi", 150000 ,562, "02/01/2021","26/02/2021");
        HangHoa sp4 = new HangThucPham("04", "Thit Bo Mi", 260000 ,747, "12/02/2020","19/02/2020");
        HangHoa sp5 = new HangThucPham("05", "Ca Thu", 120000 ,903, "30/11/2019","10/12/2019");
        HangHoa sp6 = new HangThucPham("06", "Rau Lan", 18000 ,2041, "13/04/2018","20/04/2018");
        //TẠO ĐỐI TƯỢNG HÀNG SÀNH SỨ
        HangHoa sp7 = new HangSanhSu("01", "Chen Tra", 80000, 235, "20/11/2014", "HUE");
        HangHoa sp8 = new HangSanhSu("02", "Chen Com", 65000, 940, "19/11/2012", "TP HCM");
        HangHoa sp9 = new HangSanhSu("03", "Am Tra", 50000, 322, "20/02/2013", "SAI GON");
        HangHoa sp10 = new HangSanhSu("04", "Muong Su", 45000, 446, "30/01/2011", "NGHE AN");
        HangHoa sp11 = new HangSanhSu("05", "Chen Su", 500000, 783, "21/12/2028", "DA NANG");
        HangHoa sp12 = new HangSanhSu("06", "To Su", 700000, 621, "30/04/2010", "LONG AN");
        HangHoa sp13 = new HangSanhSu("07", "Am Su", 800000, 1225, "20/12/2015", "BAT TRANG");
        //TẠO ĐỐI TƯỢNG HÀNG ĐIỆN MÁY
        HangHoa sp14 = new HangDienMay("01", "May Lanh", 15000000, 75,"18/1/2017", 500);
        HangHoa sp15 = new HangDienMay("02", "May Giat", 18000000, 35,"17/02/2016", 700);
        HangHoa sp16 = new HangDienMay("03", "May Say Toc", 899000, 25,"16/03/2010", 250);
        HangHoa sp17 = new HangDienMay("04", "May Danh Trung", 1399000, 20,"15/04/2011", 1000);
        HangHoa sp18 = new HangDienMay("05", "May Dieu Hoa", 2350000, 49,"14/05/2012", 1500);
        HangHoa sp19 = new HangDienMay("06", "Quat May", 490000, 30,"13/06/2009", 125);
        HangHoa sp20 = new HangDienMay("07", "May Loc Khong Khi", 12500000, 66,"5/6/2002", 100);
        //THÊM 20 SẢN PHẨM VÀO DANH SÁCH dS
        dS.themMotHangHoa(sp1);
        dS.themMotHangHoa(sp2);
        dS.themMotHangHoa(sp3);
        dS.themMotHangHoa(sp4);
        dS.themMotHangHoa(sp5);
        dS.themMotHangHoa(sp6);
        dS.themMotHangHoa(sp7);
        dS.themMotHangHoa(sp8);
        dS.themMotHangHoa(sp9);
        dS.themMotHangHoa(sp10);
        dS.themMotHangHoa(sp11);
        dS.themMotHangHoa(sp12);
        dS.themMotHangHoa(sp13);
        dS.themMotHangHoa(sp14);
        dS.themMotHangHoa(sp15);
        dS.themMotHangHoa(sp16);
        dS.themMotHangHoa(sp17);
        dS.themMotHangHoa(sp18);
        dS.themMotHangHoa(sp19);
        dS.themMotHangHoa(sp20);
        //MENU TỔNG
        System.out.println("||+++++++++++++++++++++++++++++++++++++++++++||");
        System.out.println("||                                           ||");
        System.out.println("||   TEN SINH VIEN : NGUYEN RIN              ||");
        System.out.println("||   MSSV : 2008110034                       ||");
        System.out.println("||   MON : LAP TRINH HUONG DOI TUONG         ||");
        System.out.println("||   GIAO VIEN HUONG DAN : T.LE HUYNH PHUOC  ||");
        System.out.println("||   TRUONG DAI HOC GIA DINH                 ||");
        System.out.println("||                                           ||");
        System.out.println("||+++++++++++++++++++++++++++++++++++++++++++||");
		while(luaChon != 0){
            System.out.println("||++++++++++++++++MENU++++++++++++++++++||");
            System.out.println("||       1.Thao tac voi hang hoa :      ||");
            System.out.println("||        1.1 Them                      ||");
            System.out.println("||        1.2 Sua                       ||");
            System.out.println("||        1.3 Xoa                       ||");
            System.out.println("||       2.Tim kiem theo :              ||");
            System.out.println("||        2.1 Loai                      ||");
            System.out.println("||        2.2 Gia                       ||");
            System.out.println("||        2.3 Ngay nhap                 ||");
            System.out.println("||        2.4 Gia tri cao nhat          ||");
            System.out.println("||        2.5 Tong gia tri cao nhat     ||");
            System.out.println("||      3.Sap xep tang dan theo :       ||");
            System.out.println("||        3.1 Gia nhap                  ||");
            System.out.println("||        3.2 Ngay nhap                 ||");
            System.out.println("||        3.3 Loai va ngay nhap         ||");
            System.out.println("||        3.4 Loai va gia nhap          ||");
            System.out.println("||       4.Sap xep giam dan theo :      ||");
            System.out.println("||        4.1 Gia nhap                  ||");
            System.out.println("||        4.2 Ngay nhap                 ||");
            System.out.println("||        4.3 Loai va ngay nhap         ||");
            System.out.println("||        4.4 Loai va gia nhap          ||");
            System.out.println("||       5.Thong ke :                   ||");
            System.out.println("||        5.1 Tong so luong hang hoa    ||");
            System.out.println("||        5.2 Tong gia tri nhap kho     ||");
            System.out.println("||        5.3 So luong tung loai hang   ||");
            System.out.println("||       0.Thoat chuong trinh           ||");
            System.out.println("||++++++++++++++++MENU++++++++++++++++++||");
            System.out.print("Nhap lua chon cua ban : ");
            luaChon = bienNhap.nextInt();
            switch(luaChon){
                case 1 : {
                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)
                    System.out.println("||++++++++MENU++++++++||");
                    System.out.println("|| 1. Them hang hoa   ||");
                    System.out.println("|| 2. Sua hang hoa    ||");
                    System.out.println("|| 3. Xoa hang hoa    ||");
                    System.out.println("|| 0.  Thoat          ||");
                    System.out.println("||++++++++MENU++++++++||");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = bienNhap.nextInt();
                    switch(luaChon){
                        case 1 : dS.themHangHoa();break;
                        case 2 : dS.suaHangHoa();break;
                        case 3 : dS.xoaHangHoa();break;
                        case 0 : System.out.println("Thoat");
                        default : break;
                    }
                    break;
                }
                case 2 : {
                    //MENU TÌM KIẾM HÀNG HÓA THEO LOẠI , KHOẢNG NGÀY , KHOẢNG GIÁ
                    System.out.println("||+++++++++++MENU+++++++++++++||");
                    System.out.println("|| 1. Tim kiem theo loai      ||");
                    System.out.println("|| 2. Tim kiem theo ngay nhap ||");
                    System.out.println("|| 3. Tim kiem theo gia       ||");
                    System.out.println("|| 4. Gia tri cao nhat        ||");
                    System.out.println("|| 5. Tong gia tri cao nhat   ||");
                    System.out.println("|| 0. Thoat                   ||");
                    System.out.println("||+++++++++++MENU+++++++++++++||");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = bienNhap.nextInt();
                    switch(luaChon){
                        case 1 : dS.timKiemTheoLoai();break;
                        case 2 : dS.timKiemTheoNgay();break;
                        case 3 : dS.timKiemTheoGia();break;
                        case 4 : dS.timKiemSanPhamGiaTriCao();break;
                        case 5 : dS.timKiemSanPhamTongGiaTriCaoNhat();break;
                        case 0 : System.out.println("Thoat");
                        default : break;
                    }
                    break;
                }
                case 3 : {
                    //MENU SẮP XẾP HÀNG HÓA TĂNG DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("||+++++++++++++++MENU+++++++++++++++||");
                    System.out.println("|| 1. Gia nhap                      ||");
                    System.out.println("|| 2. Ngay nhap                     ||");
                    System.out.println("|| 3. Loai va ngay nhap             ||");
                    System.out.println("|| 4. Loai va gia nhap              ||");
                    System.out.println("|| 0. Thoat                         ||");
                    System.out.println("||+++++++++++++++MENU+++++++++++++++||");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = bienNhap.nextInt();
                    switch(luaChon){
                        case 1 : dS.sapXepHangHoaTangDanTheoGia();break;
                        case 2 : dS.sapXepHangHoaTangDanTheoNgay();break;
                        case 3 : dS.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : dS.SapXepTangDanTheoLoaiVaTheoGia();break;
                        case 0 : System.out.println("Thoat");
                        default : break;
                    }
                    break;
                }
                case 4 : {
                    //MENU SẮP XẾP HÀNG HÓA GIẢM DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("||++++++++++++++MENU+++++++++++++||");
                    System.out.println("|| 1. Gia nhap                   ||");
                    System.out.println("|| 2. Ngay nhap                  ||");
                    System.out.println("|| 3. Loai va ngay nhap          ||");
                    System.out.println("|| 4. Loai va gia nhap           ||");
                    System.out.println("|| 0. Thoat                      ||");
                    System.out.println("||++++++++++++++MENU+++++++++++++||");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = bienNhap.nextInt();
                    switch(luaChon){
                        case 1 : dS.sapXepHangHoaGiamDanTheoGia();break;
                        case 2 : dS.sapXepHangHoaGiamDanTheoNgay();break;
                        case 3 : dS.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : dS.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        case 0 : System.out.println("Thoat");
                        default : break;
                    }
                    break;
                }
                case 5 : dS.thongKeTongHangHoa();break;
                default : break;
                
            }
            
        }
    }
}
