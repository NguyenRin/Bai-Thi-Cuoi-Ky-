package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.DecimalFormat;
import java.text.ParseException;
public class HangDienMay extends HangHoa{
    private int congSuat;
    public HangDienMay(String maHangHoa,String tenHangHoa, float giaNhap, int soLuongTonKho, String ngayNhapKho , int congSuat) throws ParseException {
        super("HDM-" + maHangHoa,tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.congSuat = congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public int getCongSuat() {
        return congSuat;
    }
    DecimalFormat df = new DecimalFormat("##### W");
    DecimalFormat dF = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format("%-20s|%-20s|", df.format(getCongSuat()),dF.format(tinhTien()));
        return s ;
    }
}
