package com.afshin.json;

import com.afshin.json.entities.User;
import com.afshin.json.helpers.Logger;
import org.json.JSONObject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = Logger.readInfo();
        Logger.println(a);
    }
}
