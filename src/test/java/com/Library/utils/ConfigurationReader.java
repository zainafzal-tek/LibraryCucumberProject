package com.Library.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e){
            System.err.println("Properties file could not be located!");
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
