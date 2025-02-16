package org.itstack.demo.desgin.test;

import org.itstack.demo.desgin.CacheService;
import org.itstack.demo.desgin.factory.JDKProxy;
import org.itstack.demo.desgin.factory.impl.EgmCacheAdapter;
import org.itstack.demo.desgin.factory.impl.IIRCacheAdapter;
import org.itstack.demo.desgin.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheService proxy_Egm = JDKProxy.getProxy(CacheServiceImpl.class, new EgmCacheAdapter());
        proxy_Egm.set("user_name_01", "小傅哥");
        String val01 = proxy_Egm.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
