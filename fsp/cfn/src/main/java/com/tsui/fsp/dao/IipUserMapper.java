package com.tsui.fsp.dao;

import com.tsui.fsp.vo.IpUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IipUserMapper {

    /**
     * select all infos of user
     * @param userid
     * @param offset
     * @param pagesize
     * @return
     */
    public List<IpUserVo> findAllInfos(Integer userid, int offset, int pagesize);

    int deleteByPrimaryKey(String userid);

    int insert(IpUserVo record);

    int insertSelective(IpUserVo record);

    IpUserVo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(IpUserVo record);

    int updateByPrimaryKey(IpUserVo record);
}