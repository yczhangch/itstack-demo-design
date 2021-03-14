package org.itstack.demo.design;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * 1. auth          审核流程
 * 2. queryAuthInfo 查询审核信息(时间)
 *
 * @author My
 */
public class AuthService {

    private static final Map<String, Date> AUTH_MAP = new ConcurrentHashMap<>();

    /**
     * 查询审核结果
     */
    public static Date queryAuthInfo(String uId, String orderId) {
        return AUTH_MAP.get(uId.concat(orderId));
    }

    /**
     * 处理审核结果
     *
     * @param uId
     * @param orderId
     */
    public static void auth(String uId, String orderId) {
        AUTH_MAP.put(uId.concat(orderId), new Date());
    }

}
