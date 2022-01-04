package com.rin2008110034.BaiThiCuoiKiHDT.NguyenRin;
import java.text.DecimalFormat;
import java.text.ParseException;
public class HangSanhSu extends HangHoa {
    private String xuatXu;
    public HangSanhSu(String maHangHoa, String tenHangHoa, float giaNhap, int soLuongTonKho, String ngayNhapKho ,String xuatXu)throws ParseException {
        super("HSS-"+maHangHoa, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.xuatXu = xuatXu;
    }
    public String getXuatXu() {
        return xuatXu;
    }
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    DecimalFormat df = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|",getXuatXu(),df.format(tinhTien()));
        return s;
    }
}
