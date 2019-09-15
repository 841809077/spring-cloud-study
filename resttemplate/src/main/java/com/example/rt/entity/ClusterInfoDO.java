package com.example.rt.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 * <pre>
 * 
 * </pre>
 * <small> 2019-03-06 14:18:38 | Aron</small>
 */
@Data
@SuppressWarnings("serial")
@TableName("cluster_info")
public class ClusterInfoDO {
//    @TableField(exist = false)
//    private static final long serialVersionUID = 1L;

    @TableId
    private String code;

    /** 集群名称 */
    private String name;

    /** 所属节点编码 */
    @TableField(value="node_code")
    private String nodeCode;

    /** 地址 */
    @TableField(value="ip_addr")
    private String ipAddr;

    /** 登录用户名 */
    @TableField(value="login_name")
    private String loginName;

    /** 加密存储 */
    private String password;

    /** 0-未通讯，1-通讯正常 */
    private Integer status;

    /** 如果通讯不正常，则该字段值不变 */
    @TableField(value="last_connect_time")
    private Date lastConnectTime;

    /** 排序号，从1开始，1表示排在最前面，如果两条数据排序字段相同，则以查询节点名称进行排序 */
    @TableField(value="order_id")
    private Integer orderId;

    /**  */
    @TableField(value="product_version")
    private String productVersion;

    /** 0-正常，1-已删除 */
    @TableField(value="delete_flag")
    private Integer deleteFlag;

    /**  */
    private String message;

    /** 添加时间 */
    @TableField(value="add_time")
    private Date addTime;

    /** 修改时间 */
    @TableField(value="modify_time")
    private Date modifyTime;

    /** 集群下摄像头数量 */
    @TableField(value="camera_nums")
    private Integer cameraNums;

    /** 厂商 */
    private String manufacturer;

//    public  String getUrl(){
//        return "http://" + getIpAddr() +"/business/api";
//    }
//
//    public String getAddress(){
//        // http://58.246.54.94:11181/
//        return "http://" + getIpAddr() + "/";
//    }

}
