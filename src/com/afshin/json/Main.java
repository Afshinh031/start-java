package com.afshin.json;

import com.afshin.json.entities.User;
import com.afshin.json.helpers.Logger;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        Logger.println("Application is running ...\n");
        User user = new User();
        user.setName("Sajjad");
        user.setFamily("Alipour");
        user.setAge(20);
        Logger.println(user.toString());
        JSONObject objUser = user.toJson();
        Logger.println("Name  : "+objUser.getString("name"));
    }
}
