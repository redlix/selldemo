package com.redli.sell.utils;

import com.redli.sell.enums.CodeEnum;

/**
 * @author redLi
 * @package com.redli.sell.utils
 * @time 2018/04/11 23:16
 * @description:
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
