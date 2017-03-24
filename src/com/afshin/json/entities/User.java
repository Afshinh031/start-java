package com.afshin.json.entities;

import org.json.JSONObject;

public class User {

    private String name = null;
    private String family = null;
    private int age;

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
                "\"age\":" + getAge() +
                "}");
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":" + "\"" + getName() + "\"" + "," +
                "\"family\":" + "\"" + getFamily() + "\"" + "," +
                "\"age\":" + getAge() +
                "}";
    }
}
