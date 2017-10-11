package com.zero4kevin.spring.performance;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class Stage {
    private static Stage instance;

    private Stage() {
    }

    public static Stage getInstance() {
        if (null == instance)
            instance = new Stage();
        return instance;
    }
}