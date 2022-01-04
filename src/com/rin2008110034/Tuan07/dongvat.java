package com.rin2008110034.Tuan07;

public class dongvat {
    private int size;
    private String ten="Con Trâu";
    private int tuoi;


    void dongvat(){

    }

    protected void setSize(int s){
        if(s>0){
            s= size;

        }
        else{
            System.out.println("Kích thước ko phù hợp");
        }

    }
    public String getName(){
        return ten;
    }
    protected void setTuoi(int t){
        if(t>0){
            t=tuoi;
        }
        else{
            System.out.println("Tuoi ko phù hợp");
        }
    }
    protected void hanhDong(){
        System.out.println("Ăn cỏ....");
        System.out.println("Ngủ....");
        System.out.println("Chạy ....");
    }




}
