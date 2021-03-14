package org.itstack.demo.design.mediator;

import java.util.List;

/**
 * 对数据库操作的查询接口
 * 公众号 | bugstack虫洞栈
 * 博 客 | https://bugstack.cn
 * @author 小傅哥 @2020
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
