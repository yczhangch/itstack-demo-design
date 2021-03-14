package org.itstack.demo.design.store;

import java.util.Map;

/**
 * @author My
 */
public interface ICommodity {

    /**
     * 发放奖品
     *
     * @param uId         用户id
     * @param commodityId 奖品id
     * @param bizId       业务id
     * @param extMap      扩展字段
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
