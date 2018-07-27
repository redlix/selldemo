package com.redli.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ---------------------------------------------------------------------------------------
 *  1.0.0           2018/07/27     redli        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2018/07/27 15:54
 * @date 2018/07/27 15:54
 * @since 1.0.0
 */
public class JsonUtil {
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
