package com.robonco.javatutorial.platform;

import java.util.Enumeration;
import java.util.Iterator;

public class SystemProperties {

    public static void main(String[] args) {

        Enumeration<Object> systemPropertyKeys = System.getProperties().keys();
        String key = "";
        while (systemPropertyKeys.hasMoreElements()) {
            key = (String) systemPropertyKeys.nextElement();
            System.out.printf("%s: %s%n", key, System.getProperty(key));
        }

    }
}
