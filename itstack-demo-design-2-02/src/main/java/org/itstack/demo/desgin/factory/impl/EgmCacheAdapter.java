package org.itstack.demo.desgin.factory.impl;

import org.itstack.demo.desgin.factory.ICacheAdapter;
import org.itstack.demo.design.matter.Egm;

import java.util.concurrent.TimeUnit;

/**
 * @author My
 */
public class EgmCacheAdapter implements ICacheAdapter {

    private final Egm egm = new Egm();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
