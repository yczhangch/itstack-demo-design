package org.itstack.demo.design;

import org.itstack.demo.design.store.ICommodity;
import org.itstack.demo.design.store.impl.CardCommodityService;
import org.itstack.demo.design.store.impl.CouponCommodityService;
import org.itstack.demo.design.store.impl.GoodsCommodityService;

/**
 * 商品工厂根据类型选择发放不同的奖品
 *
 * @author My
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        // 如果是spring，会注入这些实例，直接return，不用new
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }

}
