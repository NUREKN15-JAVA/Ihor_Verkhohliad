package main.java.ua.nure.verkhohliad.util;

import java.util.ResourceBundle;


public class Message {
    private static final String BUNDLE_NAME = "message";

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    public static String getString(String key) {
        return RESOURCE_BUNDLE.getString(key);
    }
}