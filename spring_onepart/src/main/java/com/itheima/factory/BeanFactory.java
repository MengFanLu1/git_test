package com.itheima.factory;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    private static Properties pro;

    static {
        pro = new Properties();
        try {

            pro.load(BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String name){
        String path = pro.getProperty(name);
        try {

            return Class.forName(path).newInstance();

        } catch (Exception e) {

            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

}
