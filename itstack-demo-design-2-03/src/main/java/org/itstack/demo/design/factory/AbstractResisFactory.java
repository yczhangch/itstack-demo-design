package org.itstack.demo.design.factory;

import org.itstack.demo.design.RedisUtils;
import org.itstack.demo.design.matter.Egm;
import org.itstack.demo.design.matter.Iir;

/**
 * 类的选择问题
 *
 * @author zycstart
 * @create 2021-03-14 11:35
 */
public abstract class AbstractResisFactory {
    //可以参考 StoreFactory

    public abstract RedisUtils getRedisUtils();

    public abstract Egm getEgm();

    public abstract Iir getIir();

//
//    private final RedisUtils redisUtils = new RedisUtils();
//
//    private final Egm egm = new Egm();
//
//    private final IIR iir = new IIR();
}
