package com.xxj.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/29 6:07 PM
 */
@Data
public class SaasSchoolDTO implements Serializable {

    private static final long serialVersionUID = 1984478343808139450L;

    private Long id;
    private String shortName;
    /**
     * 学校名称
     */
    private String cname;


    /**
     * 校区信息
     */
    private String schoolDistrict;

    /**
     * 学制
     *
     * @see com.voxlearning.utopia.api.constant.EduSystemType
     * @see com.voxlearning.utopia.service.user.api.entities.SchoolExtInfo#setEduSystem
     */
    private String eduSystem;

    /**
     * 所属行政区域
     */
    private Integer regionCode;

    /**
     * 学校主干名
     */
    private String cmainName;
    /**
     * 学区
     */
    private String eDistrict;
    /**
     * 学校级别（1小学，2中学 4高中 3可能以后表示小学初中）
     */
    private Integer level;
    /**
     * 学校类型
     *
     * @see com.voxlearning.alps.annotation.meta.SchoolType
     */
    private Integer type;

    /**
     * 租户id集合
     */
    private List<String> tenantIdList;
    /**
     * 街镇
     */
    private String eStreet;
    /**
     * 办学类型
     */
    private String EBxlx;

    /**
     * 机构代码
     */
    private String eXxdm;

    /**
     * 社会统一信用代码
     */
    private String eTyshxydm;

    /**
     * 学校类型,1：机关，2：直属单位，3：学校(主校)，4：分校，9：其他
     */
    private String eXxlb;
    /**
     * 校区号
     */
    private String eXqh;
    /**
     * 校区类型
     */
    private String eXqlx;
    /**
     * 通讯地址
     */
    private String eXxdz;
    /**
     * 校区地址
     */
    private String eXqdz;


    /**
     * 以下为自定义字段
     * 该校班级数
     */
    private Long classCount;
    /**
     * 该校学生数
     */
    private Long studentCount;
    /**
     * 该校老师数
     */
    private Long teacherCount;

    /**
     * 学校地址
     */
    private String address;
}
