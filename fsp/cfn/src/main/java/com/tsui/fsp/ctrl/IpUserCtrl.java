package com.tsui.fsp.ctrl;

import com.tsui.fsp.dao.IipUserMapper;
import com.tsui.fsp.vo.IpUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("ipuser")
public class IpUserCtrl{
    @Autowired
    IipUserMapper ipUserMapper;
    @RequestMapping("/getall")
    public List<IpUserVo> getAll(){
        System.out.println("qqq");
        return ipUserMapper.findAllInfos(2,0,1);
    }



}
