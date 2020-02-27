package com.company.java.kyu6;

import java.util.LinkedHashMap;
import java.util.Map;

public class FixmeHello {private Map<String, String> attrs = new LinkedHashMap<>();

    public FixmeHello() {
        attrs.put("greeting", "Hello.");
    }

    public FixmeHello setAge(int age) {
        attrs.put("age", String.format("I am %d.", age));
        return this;
    }

    public FixmeHello setSex(char sex) {
        attrs.put("sex", String.format("I am %s.", sex == 'M' ? "male" : "female"));
        return this;
    }

    public FixmeHello setName(String name) {
        attrs.put("name", String.format("My name is %s.", name));
        return this;
    }

    public String hello() {
        return String.join(" ", attrs.values());
    }
}

//linkedHasMap jer je bitan redosled setovanja vrednosti