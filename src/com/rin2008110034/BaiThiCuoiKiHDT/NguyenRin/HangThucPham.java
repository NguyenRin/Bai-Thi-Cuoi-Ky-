package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
public class HangThucPham extends HangHoa{
    private Date ngayHH;
    public HangThucPham(String maHangHoa, String tenHangHoa, float giaNhap, int soLuongTonKho, String ngayNhapKho , String ngayHH)throws ParseException {
        super("HTP-" + maHangHoa, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.ngayHH = chuoiSangNgay(ngayHH);
    }
    public Date getNgayHetHan() {
        return ngayHH;
    }
    public void setNgayHetHan(Date ngayHH) {
        this.ngayHH = ngayHH;
    }
    DecimalFormat df = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format( "%-20s|%-20s|", ngaySangChuoi(getNgayHetHan()) , df.format(tinhTien()));
        return s;
    }
}
