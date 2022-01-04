package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
public class DanhSachQuanLi {
    private ArrayList<HangHoa> list ;
    private Scanner bienNhap = new Scanner(System.in);

    DanhSachQuanLi(){
        list = new ArrayList<HangHoa>();
    }
    public ArrayList<HangHoa> getList() {
        return list;
    }
    public void setList(ArrayList<HangHoa> list) {
        this.list = list;
    }
    //CHỨC NĂNG THÊM HÀNG HÓA TRỰC TIẾP
    public void themMotHangHoa(HangHoa x) throws ParseException{
        int count = 0 ;
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa sp = list.get(i);
            if(sp.getMaHangHoa().equalsIgnoreCase(x.getMaHangHoa()) || sp.getMaHangHoa().equalsIgnoreCase("HTP-") ||sp.getMaHangHoa().equalsIgnoreCase("HSS-") || sp.getMaHangHoa().equalsIgnoreCase("HDM-") ){
                System.out.println("HANG HOA BI TRUNG. VUI LONG NHAP LAI !!!!");
                count++ ;
                themHangHoa();
                break;
            }
        }
        if(count == 0){
            list.add(x);
        }
    }
    //CHỨC NĂNG THÊM HÀNG HÓA BẰNG DỮ LIỆU NHẬP TỪ BÀN PHÍM
    public void themHangHoa() throws ParseException {
        System.out.println("===========MENU===========");
        System.out.println("| 1.Hang thuc pham       |");
        System.out.println("| 2.Hang sanh su         |");
        System.out.println("| 3.Hang dien may        |");
		System.out.println("| 0.Quay lai             |");
        System.out.println("===========MENU===========");
        System.out.print("Moi ban chon loai hang hoa : ");
    	int luaChon = bienNhap.nextInt();
        HangHoa x;
        switch(luaChon){
            case 1 : {
				//HÀNG THỰC PHẨM
				System.out.println("\nNHAP THONG TIN HANG THUC PHAM NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				bienNhap.nextLine();
				String maHH = bienNhap.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = bienNhap.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = bienNhap.nextInt();
				System.out.print("Nhap don gia : ");
				float donGia = bienNhap.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                bienNhap.nextLine();
				String ngayNK = bienNhap.nextLine();
                System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");
				String ngayHH = bienNhap.nextLine();
				x = new HangThucPham( maHH, tenHH , donGia , soLuongTonKho , ngayNK , ngayHH );
				themMotHangHoa(x);
                break;
            }
			case 2 : {
				//HÀNG SÀNH SỨ
				System.out.println("\nNHAP THONG TIN HANG SANH SU NHAP KHO"); 
                System.out.print("Nhap ma hang hoa : ");
				bienNhap.nextLine();
				String maHH = bienNhap.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = bienNhap.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = bienNhap.nextInt();
				System.out.print("Nhap don gia : ");
				float donGia = bienNhap.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                bienNhap.nextLine();
				String ngayNK = bienNhap.nextLine();
                System.out.print("Nhap nha cung cap : ");
                String nhaCC = bienNhap.nextLine();
				x = new HangSanhSu(maHH, tenHH, donGia , soLuongTonKho , ngayNK , nhaCC);
                themMotHangHoa(x);
                break;
			}
			case 3 : {
				//HÀNG ĐIỆN TỬ
				System.out.println("\nNHAP THONG TIN HANG DIEN TU NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				bienNhap.nextLine();
				String maHH = bienNhap.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = bienNhap.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = bienNhap.nextInt();
				System.out.print("Nhap don gia : ");
				float donGia = bienNhap.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                bienNhap.nextLine();
				String ngayNK = bienNhap.nextLine();
                System.out.print("Nhap cong suat : ");
                int congSuat =bienNhap.nextInt();
				x = new HangDienMay(maHH, tenHH , donGia , soLuongTonKho,ngayNK, congSuat) ;
				themMotHangHoa(x);
                break;
			}
			default : break;
        } 
	}
    //CHỨC NĂNG SỬA HÀNG HÓA THÔNG QUA MÃ HÀ HÓA 
    public void suaHangHoa() throws ParseException{
        System.out.print("Nhap ma hang hoa cua hang can sua : ");
        String maHang = bienNhap.nextLine();
        for(int i = 0 ; i< list.size();i++){
            HangHoa x = list.get(i);
            if(x.getMaHangHoa().equals(maHang)){
                if(x instanceof HangThucPham){
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\nNHAP THONG TIN HANG THUC PHAM CAN SUA");
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = bienNhap.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = bienNhap.nextInt();
                    System.out.print("Nhap don gia : ");
                    float donGia = bienNhap.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    bienNhap.nextLine();
                    String ngayNK = bienNhap.nextLine();
                    System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");
                    String ngayHH = bienNhap.nextLine();
                    HangHoa a = new HangThucPham( maHH[1], tenHH , donGia , soLuongTonKho , ngayNK , ngayHH );
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
                else if(x instanceof HangSanhSu){
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\nNHAP THONG TIN HANG SANH SU CAN SUA"); 
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = bienNhap.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = bienNhap.nextInt();
                    System.out.print("Nhap don gia : ");
                    float donGia = bienNhap.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    bienNhap.nextLine();
                    String ngayNK = bienNhap.nextLine();
                    System.out.print("Nhap nha cung cap : ");
                    String nhaCC = bienNhap.nextLine();
                    HangHoa a = new HangSanhSu(maHH[1], tenHH, donGia , soLuongTonKho , ngayNK , nhaCC);
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
                else if(x instanceof HangDienMay){
                    //HÀNG ĐIỆN TỬ
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\nNHAP THONG TIN HANG DIEN TU CAN SUA");
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = bienNhap.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = bienNhap.nextInt();
                    System.out.print("Nhap don gia : ");
                    int donGia = bienNhap.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    bienNhap.nextLine();
                    String ngayNK = bienNhap.nextLine();
                    System.out.print("Nhap cong suat : ");
                    int congSuat =bienNhap.nextInt();
                    HangHoa a = new HangDienMay(maHH[1], tenHH , donGia , soLuongTonKho,ngayNK, congSuat) ;
                    list.add(list.indexOf(x),a);
                    list.remove(x);
                }
            }
        }
    }
    //CHỨC NĂNG XÓA HÀNG HÓA THEO MÃ HÀNG
    public void xoaHangHoa(){
        System.out.print("Nhap ma hang hoa can xoa : ");
		String maHH = bienNhap.nextLine();
		for(int i = 0 ; i <list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getMaHangHoa().equals(maHH)){
                list.remove(x);
            }
        }
    }
    //CÁC KIỂU XUẤT HÀNG HÓA
    public void xuatHangThucPham(){
        System.out.println("HANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof HangThucPham){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHangSanhSu(){
        System.out.println("HANG SANH SU");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof HangSanhSu){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHangDienMay(){
        System.out.println("HANG DIEN MAY");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : list) {
            if(hangHoa instanceof HangDienMay){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHangThucPhamTrucTiep(HangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHangSanhSuTrucTiep(HangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHangDienMayTrucTiep(HangHoa x){
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatHangThucPhamTheoDanhSach(ArrayList<HangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG THUC PHAM");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHangSanhSuTheoDanhSach(ArrayList<HangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG SANH SU");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Xuat xu","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();

    }
    public void xuatHangDienMayTheoDanhSach(ArrayList<HangHoa> l){
        System.out.println("\t\t\t\t\t\t\t\tHANG DIEN MAY");
		for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-8s|%-25s|%-25s|%-23s|%-20s|%-20s|%-20s|\n","Ma Hang","Ten Hang Hoa","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Tong gia tri");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
        for (HangHoa hangHoa : l) {
            System.out.println(hangHoa);
        }
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
        System.out.println();
    }
    public void xuatTatCa(){
        for(int i = 0 ; i < list.size() ; i++){
           HangHoa x = list.get(i);
            if(x instanceof HangThucPham){
                xuatHangThucPhamTrucTiep(x);
            }
            else if(x instanceof HangSanhSu){
                xuatHangSanhSuTrucTiep(x);
            }
            else if(x instanceof HangDienMay){
                xuatHangDienMayTrucTiep(x);
            }
        }
    }
    //CÁC CHỨC NĂNG SẮP XẾP TĂNG DẦN GIẢM DẦN
    public void sapXepHangHoaGiamDanTheoGia(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHangHoaTangDanTheoGia(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHangHoaTangDanTheoNgay(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().after(o2.getNgayNhapKho())){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().equals(o2.getNgayNhapKho())){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void sapXepHangHoaGiamDanTheoNgay(){
        Collections.sort(list,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
    }
    public void SapXepTangDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof HangThucPham){
                list1.add(x);
            }
            else if(x instanceof HangSanhSu){
                list2.add(x);
            }
            else if(x instanceof HangDienMay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangThucPhamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangSanhSuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangDienMayTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoNgayNhap(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof HangThucPham){
                list1.add(x);
            }
            else if(x instanceof HangSanhSu){
                list2.add(x);
            }
            else if(x instanceof HangDienMay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangThucPhamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangSanhSuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangDienMayTheoDanhSach(list3);
    }
    public void SapXepTangDanTheoLoaiVaTheoGia(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof HangThucPham){
                list1.add(x);
            }
            else if(x instanceof HangSanhSu){
                list2.add(x);
            }
            else if(x instanceof HangDienMay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangThucPhamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangSanhSuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatHangDienMayTheoDanhSach(list3);
    }
    public void SapXepGiamDanTheoLoaiVaTheoGia(){
        ArrayList<HangHoa> list1 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list2 = new ArrayList<HangHoa>();
        ArrayList<HangHoa> list3 = new ArrayList<HangHoa>();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x instanceof HangThucPham){
                list1.add(x);
            }
            else if(x instanceof HangSanhSu){
                list2.add(x);
            }
            else if(x instanceof HangDienMay){
                list3.add(x);
            }
        }
        Collections.sort(list1,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangThucPhamTheoDanhSach(list1);
        Collections.sort(list2,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangSanhSuTheoDanhSach(list2);
        Collections.sort(list3,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatHangDienMayTheoDanhSach(list3);
    }
    //CÁC CHỨC NĂNG TÌM KIẾM 
    public void timKiemTheoLoai(){
        int luaChon = 0;
        System.out.println("==========MENU===========");
		System.out.println("| 1. Hang thuc pham     |");
		System.out.println("| 2. Hang sanh su       |");
		System.out.println("| 3. Hang đien may      |");
		System.out.println("==========MENU===========");
		System.out.print("Nhap lua chon cua ban : ");
		luaChon = bienNhap.nextInt();
		switch(luaChon){
			case 1 :{System.out.println("CAC LOAI HANG THUC PHAM LA :");
					 xuatHangThucPham();
					 break;
					}
			case 2 :{System.out.println("CAC LOAI HANG SANH SU LA : ");
					 xuatHangSanhSu();
					 break;
					}
			case 3 :{System.out.println("CAC LOAI HANG ĐIEN MAY LA :");
					 xuatHangDienMay();
					 break;
					}
		}
    }
    public void timKiemTheoNgay() throws ParseException{
        System.out.println("Nhap khoang thoi gian can tim kiem tu ngay : ");
		String ngayBatDau = bienNhap.nextLine();
		System.out.println(" den ngay :");
		String ngayKetThuc = bienNhap.nextLine();
		System.out.println("CAC LOAI HANG DA NHAP KHO TU NGAY " + ngayBatDau +" DEN NGAY " + ngayKetThuc + " LA :");
        for(int i = 0 ; i<list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayBatDau)) >= 0 && x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0  ){
                if(x instanceof HangThucPham){
                    xuatHangThucPhamTrucTiep(x);
                }
                else if(x instanceof HangSanhSu){
                    xuatHangSanhSuTrucTiep(x);
                }
                else if(x instanceof HangDienMay){
                    xuatHangDienMayTrucTiep(x);
                }
            }
        }
    }
    public void timKiemTheoGia(){
        System.out.println("Nhap khoang gia can tim kiem tu : ");
		long giaBatDau = bienNhap.nextInt();
		System.out.println(" den : ");
		long giaKetThuc = bienNhap.nextInt();
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getGiaNhap() >= giaBatDau && x.getGiaNhap() <= giaKetThuc){
                if(x instanceof HangThucPham){
                    xuatHangThucPhamTrucTiep(x);
                }
                else if(x instanceof HangSanhSu){
                    xuatHangSanhSuTrucTiep(x);
                }
                else if(x instanceof HangDienMay){
                    xuatHangDienMayTrucTiep(x);
                }
            }
        }
    }
    public void timKiemSanPhamGiaTriCao(){
        HangHoa y = list.get(0);
        float max = y.getGiaNhap();

        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getGiaNhap() > max){
                max = x.getGiaNhap();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.getGiaNhap() == max){
                System.out.println("San pham co gia tri cao nhat la : ");
                xuatHangSanhSuTrucTiep(x);
            }
        }
    } 
    public void timKiemSanPhamTongGiaTriCaoNhat(){
        HangHoa y = list.get(0);
        float max = y.tinhTien();

        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.tinhTien() > max){
                max = x.tinhTien();
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            HangHoa x = list.get(i);
            if(x.tinhTien() == max){
                System.out.println("San pham co tong gia tri cao nhat la : ");
                xuatHangSanhSuTrucTiep(x);
            }
        }
    }    
    public static Date chuyenChuoiSangNgay(String chuoi) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoi);
        return date;
    }
    
    DecimalFormat df = new DecimalFormat("###,###,### VND");
    public void thongKeTongHangHoa(){
        float tongSoLuong = 0 ,tongChiPhi = 0;
        for (HangHoa hangHoa : list) {
            tongSoLuong += hangHoa.getSoLuongTonKho();
            tongChiPhi += hangHoa.tinhTien();
        }
		SapXepTangDanTheoLoaiVaTheoGia();
        System.out.println("\tBANG THONG KE");
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-34s|%-112d|\n","Tong so luong",tongSoLuong);
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-34s|%-25s%-20s|\n","Tong chi phi"," ",df.format(tongChiPhi));
        for (int i =0; i< 149; i++) {
			System.out.print("-");
		}
		System.out.println();

    }
}
