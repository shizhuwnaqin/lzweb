package com.lezhuan.lzweb.po;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Env {
    private Integer id;

    private String env;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}