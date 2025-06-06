package com.lin.springcloud.utils;

public class AssertUtil {

    /**
     * 判断对象是否为空
     * @param object
     * @param message
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
    /**
     * 判断对象是否为空
     * @param object
     * @param message
     */
    public static void notEmpty(String object, String message) {
        if (object == null || object.length() == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * 判断对象是否为空
     * @param object
     * @param message
     */
    public static void notEmpty2(Object[] object, String message) {
        if (object == null || object.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
