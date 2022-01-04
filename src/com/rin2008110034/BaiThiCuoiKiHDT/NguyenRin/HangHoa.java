package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HangHoa {
    private String maHangHoa;
    private String tenHangHoa;
    private float giaNhap;
    private int soLuongTonKho;
    private Date ngayNhapKho;
    public HangHoa(String maHangHoa , String tenHangHoa , float giaNhap , int soLuongTonKho , String ngayNhapKho) throws ParseException {
        this.tenHangHoa = tenHangHoa ;
        this.giaNhap = giaNhap ;
        this.soLuongTonKho = soLuongTonKho;
        this.maHangHoa = maHangHoa;
        this.ngayNhapKho = chuoiSangNgay(ngayNhapKho);
        
    }
    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }
    public String getMaHangHoa() {
        return maHangHoa;
    }
    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    } 
    public String getTenHangHoa() {
        return tenHangHoa;
    }
    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    public float getGiaNhap() {
        return giaNhap;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public static Date chuoiSangNgay(String chuoi) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoi);
        return date;
    }
	public static String ngaySangChuoi(Date date){
        String ngay = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        ngay =  simpleDateFormat.format(date);
        return ngay;

    }
    public float tinhTien(){
        return getSoLuongTonKho()*getGiaNhap();
    }
    DecimalFormat df = new DecimalFormat("###,###,### VND");
    public String toString() {
		String s = "";
		s += String.format("|%-8s|%-25s|%-25s|%-23s|%-20s|", getMaHangHoa(),getTenHangHoa(),getSoLuongTonKho(), df.format(getGiaNhap()),ngaySangChuoi(getNgayNhapKho()));
		return s;
	}
}
