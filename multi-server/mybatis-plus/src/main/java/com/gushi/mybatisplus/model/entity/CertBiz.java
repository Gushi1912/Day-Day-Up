package com.gushi.mybatisplus.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/4/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_cert_biz")
public class CertBiz {
    private Integer id;
    /**
     * 证书申请编号
     */
    private String certRequestNo;
    /**
     * 证书序列号
     */
    @TableField("cert_sn")
    private String certSN;
    /**
     * 证书起始日期
     */
    private Date certBeginTime;
    /**
     * 证书截至日期
     */
    private Date certEndTime;
    /**
     * 签名证书
     */
    private String signCert;
    /**
     * 业务状态（1.已申请）
     */
    private Integer certBizStatus;
    /**
     * 业务发生时间
     */
    private Date bizTime;
    /**
     * 设备号
     */
    @TableField("device_no")
    private String deviceNO;
    /**
     * 用户唯一标识
     */
    private String personUid;
    /**
     * 更新时间
     */
    private Date updateDate;
}
