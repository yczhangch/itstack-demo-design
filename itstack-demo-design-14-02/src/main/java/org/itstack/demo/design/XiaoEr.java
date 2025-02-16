package org.itstack.demo.design;

import org.itstack.demo.design.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * @author 小傅哥(fustack) @2020
 * <p>
 * 饭店小二，负责点单
 * @author My
 */
public class XiaoEr {

    private final Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private final List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}
