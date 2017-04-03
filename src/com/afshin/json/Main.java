package com.afshin.json;

import com.afshin.json.entities.User;
import com.afshin.json.helpers.Logger;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        byte operation = 0;
        String name , family;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Logger.println("Application runing.....");
        Logger.println("");
        Logger.println("1.جستوجوی نام و شماره تلفن");
        Logger.println("2.افزودن شماره تلفن");
        Logger.println("3.خروج");
        try {
            operation = input.nextByte();
        }catch (Exception e){
            Logger.println("شماره عملیات را درست وارد کنید به صورت عددی بین 1 یا 2......");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            main(null);
        }




        switch (operation) {
            case 1://جستوجو
                Logger.println("نام را وارد کنید");
                name = input2.nextLine();
                Logger.println("نام خانوادگی را وارد کنید");
                family = input2.nextLine();

                User myUser = new User();
                myUser.readUserInfo(name , family);


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Logger.println("");
                Logger.println("");
                main(null);

                break;


            case 2://افزودن
                User writeUserInfo = new User();
                writeUserInfo.setUserInfo();
                writeUserInfo.saveUserInfo();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Logger.println("");
                Logger.println("");
                main(null);

                break;





            case 3://خروج
                return;


            
            default:
                Logger.println("شماره عملیات را درست وارد کنید به صورت عددی بین 1 تا 3......");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                main(null);
                break;

        }







    }
}
