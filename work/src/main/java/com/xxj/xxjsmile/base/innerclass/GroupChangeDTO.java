package com.xxj.xxjsmile.base.innerclass;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description: 群变更实体 数据库记录群公告的变更，但是前端不展示，只展示群创建、群名变更、群主变更、群解散四个事件；
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/25 18:15
 * All Rights Reserved
 */
@Data
@Accessors(chain = true)
public class GroupChangeDTO implements Serializable {
    private static final long serialVersionUID = -4830806733303626330L;


    /**
     * 群名称
     */
    private String name;

    /**
     * 群主
     */
    private String owner;


    /**
     * 变更日志
     */
    private List<GroupChangeLogDTO> logs;

    @Data
    @Accessors(chain = true)
    public  static class GroupChangeLogDTO implements Serializable {

        private String id;
        /**
         * 企业id
         */
        private String corpId;


        /**
         * 创建时间
         */

        private Date createDatetime;

        /**
         * 更新时间
         */

        private Date updateDatetime;


        /**
         * 变更记录
         */
        private String changeRecord;

        /**
         * 群id
         */
        private String groupId;

        /**
         * 变更前
         */
        private String originalData;

        /**
         * 变更后
         */
        private String nowData;
    }


}
