package com.xxj.xxjsmile.base.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/25 18:45
 * All Rights Reserved
 */
public class TestGroupChangeDTO {

    public static void main(String[] args) {

        GroupChangeDTO changeDTO = new GroupChangeDTO();

        GroupChangeDTO.GroupChangeLogDTO changeLogDTO = new GroupChangeDTO.GroupChangeLogDTO();

        List<GroupChangeDTO.GroupChangeLogDTO> list = new ArrayList<>();
        list.add(changeLogDTO);
        changeDTO.setLogs(list);
        System.out.println(changeDTO);
    }
}
