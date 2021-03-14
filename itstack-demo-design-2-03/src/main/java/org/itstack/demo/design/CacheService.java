package org.itstack.demo.design;

import java.util.concurrent.TimeUnit;

/**
 * @author zycstart
 * @create 2021-03-14 11:33
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
