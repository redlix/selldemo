package com.redli.sell.utils;

import java.util.Random;

/**
 * @author redLi
 * @package com.redli.sell.utils
 * @time 2018/04/11 23:07
 * @description:
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
