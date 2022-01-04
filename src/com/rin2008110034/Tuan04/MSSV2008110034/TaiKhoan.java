package com.rin2008110034.Tuan04.MSSV2008110034;
public class TaiKhoan {
    double account_balance;
    long account_number;
    Khachhang1 kH=new Khachhang1();
     public void showData(){
        System.out.println("Account Number: "+kH.account_number);
        System.out.println("Account Balance: "+kH.account_balance);

    }
      
    public void deposite(double amount){
        kH.account_balance += amount;

    }
    public void withdraw(double amount1){
        kH.account_balance -= amount1;
    }

    }
    
