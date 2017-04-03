package com.afshin.json.entities;

import com.afshin.json.helpers.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;

public class User {

    private String name = null;
    private String family = null;
    private String phoneNumber = null;
    private int age;


    Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public JSONObject toJson() {
        return new JSONObject("{" +
                "\"name\":" + getName() + "," +
                "\"family\":" + getFamily() + "," +
                "\"phonNumber\":" + getPhoneNumber() + "," +
                "\"age\":" + getAge() +
                "}");
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"name\": \"" + getName() + "\",\n" +
                "  \"family\": \"" + getFamily() + "\",\n" +
                "  \"phoneNumber\" : \"" + getPhoneNumber() + "\",\n" +
                "  \"age\" : \"" + getAge() + "\"\n" +
                "}";
    }

    public void setUserInfo() {
        Logger.println("نام را وارد کنید");
        setName(input.nextLine());
        Logger.println("نام خانوادگی را وارد کنید");
        setFamily(input.nextLine());
        Logger.println("شماره تلفن را وارد کنید");
        setPhoneNumber(input.nextLine());
        Logger.println("سن را وارد کنید");
        try {
            setAge(input.nextInt());
        } catch (Exception e) {
            Logger.println("سن باید به صورت عدد وارد شود لطفا درست وارد کنید");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            Logger.println("سن را دوباره وارد کنید");
            setAge(input.nextInt());
        }
    }

    /***********************************write**********************************/
    public void saveUserInfo() {
        String usetInfoText = "," + toString();
        Logger.writeInfo(usetInfoText);
    }

    /**********************************read************************************/
    public void readUserInfo(String name, String family) {
        String infoText, userName, userFamily, phoneNumber;
        int age;
        infoText = "[" + Logger.readInfo("userInfo.json") + "]";
        JSONArray jsonArray = new JSONArray(infoText);


        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonProductObject = jsonArray.getJSONObject(i);
            if ((jsonProductObject.getString("name").equals(name))
                    && (jsonProductObject.getString("family").equals(family))) {
                Logger.println("name =        " + jsonProductObject.getString("name"));
                Logger.println("family =      " + jsonProductObject.getString("family"));
                Logger.println("PhoneNumber = " + jsonProductObject.getString("phoneNumber"));
                Logger.println("Age =         " + jsonProductObject.getString("age"));
                Logger.println("");
                Logger.println("");
            }
        }
    }

}