package com.rin2008110034.Tuan08;

    public class Employee extends Person{
        private int salary;

        @Override
        public  String toString() {
            String s;
            s=getName()+","+getBirthday();
            s+=","+salary;

            return s;
            
        }
    

    public void setName(String string) {
    }
}
