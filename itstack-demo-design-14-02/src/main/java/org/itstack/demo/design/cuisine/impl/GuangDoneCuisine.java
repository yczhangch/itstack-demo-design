package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.cook.ICook;
import org.itstack.demo.design.cuisine.ICuisine;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * @author 小傅哥(fustack) @2020
 * <p>
 * 广东（粤菜）
 *
 * @author My
 */
public class GuangDoneCuisine implements ICuisine {
    // 菜品与厨师结合
    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
