package com.project.platform.service;

import com.project.platform.entity.User;
import com.project.platform.vo.PageVO;

import java.util.List;
import java.util.Map;

public interface UserService extends CommonService{

    /**
     * 分页模糊查询
     * @param query
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageVO<User> page(Map<String, Object> query, Integer pageNum, Integer pageSize);




    List<User> list();

    User selectById(Integer id);

    User selectByUsername(String username);

    /**
     * 新增
     * @param entity
     */
    void insert(User entity);

    /**
     * 编辑
     * @param entity
     */
    void updateById(User entity);

    /**
     * 删除
     * @param ids
     */
    void removeByIds(List<Integer> ids);


    void topUp(Integer userId, Float amount);

    void consumption(Integer userId, Float amount);

}
