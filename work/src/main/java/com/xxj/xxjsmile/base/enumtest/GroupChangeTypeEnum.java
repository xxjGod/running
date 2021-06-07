package com.xxj.xxjsmile.base.enumtest;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/26 15:46
 * All Rights Reserved
 */
@Getter
@AllArgsConstructor
public enum GroupChangeTypeEnum {

    CREATE("create"), CHANGEOWNER("changeOwner"), CHANGENAME("changeName"), CHANGENOTICE("changeNotice"), DISMISS("dismiss");

    private String name;
}
