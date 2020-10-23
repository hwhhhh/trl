package com.tongluren.tlrweb.service;

import com.tongluren.tlrweb.domain.model.House;

import java.util.List;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 14:49
 */
public interface HouseService {
    /**
     * 获取热门房间，如：在用户登录时需要返回一系列的热门房间
     * 需要返回[id、title、type(房间类型)、price、rate、photo]*6，返回六组 共36个房间数据
     * @return
     */
    List<House> getHotHouses();

    /**
     * 获取更多的房间，返回一组（6个）数据
     * @return
     */
    List<House> getMoreHouses();

    /**
     * 获取房间详细信息，如：用户浏览时点击某个房间查看时，需要返回房间的详细信息。
     * @param id 房间id
     * @return
     */
    House findHouseById(int id);

    /**
     * 删除房主的某间房间
     * @param id
     * @return
     */
    int deleteHouseById(int id);

    /**
     * 查找待审核的房间
     * @return
     */
    List<House> findTobeReviewedHouses();
}
