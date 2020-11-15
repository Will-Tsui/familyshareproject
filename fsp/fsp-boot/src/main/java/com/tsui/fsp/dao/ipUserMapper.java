package com.tsui.fsp.dao;

import com.tsui.fsp.vo.ipUser;

public interface ipUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(ipUser record);

    int insertSelective(ipUser record);

    ipUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(ipUser record);

    int updateByPrimaryKey(ipUser record);
}