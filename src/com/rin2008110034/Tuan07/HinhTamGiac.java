package com.rin2008110034.Tuan07;

public class HinhTamGiac {
    

    private boolean nhapChuotChua;
    private int kichThuoc;
    private String amThanh;
    
    HinhTamGiac(){}
     HinhTamGiac(boolean a, int b, String c){
        nhapChuotChua = a;
        kichThuoc = b;
        amThanh = c;
    }
    protected void xoay(int d){
        System.out.print("Xoay hình Circle theo chiều kim đồng hồ "+d);
        System.out.println(" độ");
        System.out.println("Kích thước của hình sau khi xoay không thay đổi, kích thước = "+kichThuoc);
    }
    protected void phatAmThanh(){
        System.out.println("Âm thanh phát ra: "+amThanh);
    }
    protected void setKichThuoc(int s){
        
        if( s>0){    
            kichThuoc=s;
        }
        else{
            System.out.println("Kích Thước Ko hợp lệ");
        }
        
    }
    public void getAmThanh(){
            amThanh="Rẹt Rẹt Rẹt .........";
            System.out.println("Xuất âm thanh:"+amThanh);
            

            
    }
    protected void getNhapChuot(boolean n){
        if(n=true){
            n=nhapChuotChua;
        }
        else{
            System.out.println("Vui lòng nhấp chuột");
        }
    }
}


