package com.ww.model;

/**
 * 奖惩信息 实体类
 *
 * @author dell
 */
public class Cj {
    //编号
    private Integer id;
    //奖惩标题
    private String cjTitle;
    //奖惩类型
    private String cjType;
    //奖惩金额
    private String cjMoney;
    //发生时间
    private String cjTime;
    //奖惩内容
    private String cjContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCjTitle() {
        return cjTitle;
    }

    public void setCjTitle(String cjTitle) {
        this.cjTitle = cjTitle == null ? null : cjTitle.trim();
    }

    public String getCjType() {
        return cjType;
    }

    public void setCjType(String cjType) {
        this.cjType = cjType == null ? null : cjType.trim();
    }

    public String getCjMoney() {
        return cjMoney;
    }

    public void setCjMoney(String cjMoney) {
        this.cjMoney = cjMoney == null ? null : cjMoney.trim();
    }

    public String getCjTime() {
        return cjTime;
    }

    public void setCjTime(String cjTime) {
        this.cjTime = cjTime == null ? null : cjTime.trim();
    }

    public String getCjContent() {
        return cjContent;
    }

    public void setCjContent(String cjContent) {
        this.cjContent = cjContent == null ? null : cjContent.trim();
    }

    @Override
    public String toString() {
        return "Cj [id=" + id + ", cjTitle=" + cjTitle + ", cjType=" + cjType
                + ", cjMoney=" + cjMoney + ", cjTime=" + cjTime
                + ", cjContent=" + cjContent + "]";
    }

}