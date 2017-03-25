package com.afshin.json.helpers;

import java.io.*;

public class Logger {


    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void writeInfo(String textInfo) {
        byte[] byteInfo;
        try {
            FileOutputStream objWriteInfo = new FileOutputStream("userInfo.json", true);
            byteInfo = textInfo.getBytes();
            try {
                objWriteInfo.write(byteInfo);
                objWriteInfo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    public static String readInfo(String fileName) {

        String infoLine, infoText = null;

        try {
            BufferedReader objFileReader = new BufferedReader
                    (new InputStreamReader(new FileInputStream(new File(fileName))));
            StringBuilder sb = new StringBuilder();
            try {
                infoLine = objFileReader.readLine();

                while (infoLine != null) {
                    sb.append(infoLine);
                    sb.append(System.lineSeparator());
                    infoLine = objFileReader.readLine();
                }
                infoText = sb.toString();
                objFileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return infoText;

    }


}
