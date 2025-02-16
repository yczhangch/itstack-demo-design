package org.itstack.demo.design.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 模拟集群
 *
 * @author My
 */
public class Egm {

    private final Logger logger = LoggerFactory.getLogger(Egm.class);

    private final Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("Egm获取数据 key：{}" , key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Egm写入数据 key：{} val：{}" , key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Egm写入数据 key：{} val：{} timeout：{} timeUnit：{}" , key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void delete(String key) {
        logger.info("Egm删除数据 key：{}" , key);
        dataMap.remove(key);
    }
}
