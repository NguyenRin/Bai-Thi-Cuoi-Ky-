package com.rin2008110034.Tuan07;

public class Shape {
    private String sound;
    public Shape(String s){
        sound =s;
    }
    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound= sound;
    }
    public void rotate(){
        System.out.println("Xoay 360 độ");
    }
    public void playSound(){
     System.out.println("Phát âm thanh"+sound);

    }
}
