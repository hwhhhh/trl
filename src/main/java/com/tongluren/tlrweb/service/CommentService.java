package com.tongluren.tlrweb.service;

import com.tongluren.tlrweb.controller.param.CommentReq;
import com.tongluren.tlrweb.domain.model.Comment;

import java.util.List;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 14:51
 */
public interface CommentService {
    /**
     * 用户确认完成订单后，可对商家进行评价。
     * @param commentReq
     * @return 1 表示创建评价成功； 0 表示失败
     */
    int createComment(CommentReq commentReq);

    /**
     * 根据房间id获取房间相关评论
     * @param houseId
     * @return 评论列表
     */
    List<Comment> getCommentsByHouseId(int houseId);

    /**
     * 查找待审核的评论
     * @return
     */
    List<Comment> findToBeReviewedComments();
}
