package com.ww.model;

/**
 * 员工  实体类
 *
 * @author dell
 *
 */
public class Employee {
    //主键
    private Integer id;
    //员工编号
    private String emSerialnumber;
    //员工姓名
    private String emName;
    //员工性别
    private String emSex;
    //员工年龄
    private Integer emAge;
    //员工身份证
    private String emIdcard;
    //员工出生日期
    private String emBorn;
    //员工民族
    private String emNation;
    //员工婚姻状况
    private String emMarriage;
    //员工容貌
    private String emVisage;
    //员工籍贯
    private String emAncestralhome;
    //员工电话
    private String emTel;
    //员工家庭住址
    private String emAddress;
    //毕业学校
    private String emAfterschool;
    //员工专业
    private String emSpeciality;
    //员工文化水平
    private String emCulture;
    //员工上岗时间
    private String emStartime;
    //员工部门编号(关联部门表)
    private Integer emDepartmentid;
    //员工部门工种
    private String emTypework;
    //员工登记时间
    private String emCreatime;
    //员工登记人名
    private String emCreatename;

    private String emBz;

    // 部门名称 用来连接查询
    private String dtName;

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName== null ? null : dtName.trim();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmSerialnumber() {
        return emSerialnumber;
    }

    public void setEmSerialnumber(String emSerialnumber) {
        this.emSerialnumber = emSerialnumber == null ? null : emSerialnumber
                .trim();
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }

    public String getEmSex() {
        return emSex;
    }

    public void setEmSex(String emSex) {
        this.emSex = emSex == null ? null : emSex.trim();
    }

    public Integer getEmAge() {
        return emAge;
    }

    public void setEmAge(Integer emAge) {
        this.emAge = emAge;
    }

    public String getEmIdcard() {
        return emIdcard;
    }

    public void setEmIdcard(String emIdcard) {
        this.emIdcard = emIdcard == null ? null : emIdcard.trim();
    }

    public String getEmBorn() {
        return emBorn;
    }

    public void setEmBorn(String emBorn) {
        this.emBorn = emBorn == null ? null : emBorn.trim();
    }

    public String getEmNation() {
        return emNation;
    }

    public void setEmNation(String emNation) {
        this.emNation = emNation == null ? null : emNation.trim();
    }

    public String getEmMarriage() {
        return emMarriage;
    }

    public void setEmMarriage(String emMarriage) {
        this.emMarriage = emMarriage == null ? null : emMarriage.trim();
    }

    public String getEmVisage() {
        return emVisage;
    }

    public void setEmVisage(String emVisage) {
        this.emVisage = emVisage == null ? null : emVisage.trim();
    }

    public String getEmAncestralhome() {
        return emAncestralhome;
    }

    public void setEmAncestralhome(String emAncestralhome) {
        this.emAncestralhome = emAncestralhome == null ? null : emAncestralhome
                .trim();
    }

    public String getEmTel() {
        return emTel;
    }

    public void setEmTel(String emTel) {
        this.emTel = emTel == null ? null : emTel.trim();
    }

    public String getEmAddress() {
        return emAddress;
    }

    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress == null ? null : emAddress.trim();
    }

    public String getEmAfterschool() {
        return emAfterschool;
    }

    public void setEmAfterschool(String emAfterschool) {
        this.emAfterschool = emAfterschool == null ? null : emAfterschool
                .trim();
    }

    public String getEmSpeciality() {
        return emSpeciality;
    }

    public void setEmSpeciality(String emSpeciality) {
        this.emSpeciality = emSpeciality == null ? null : emSpeciality.trim();
    }

    public String getEmCulture() {
        return emCulture;
    }

    public void setEmCulture(String emCulture) {
        this.emCulture = emCulture == null ? null : emCulture.trim();
    }

    public String getEmStartime() {
        return emStartime;
    }

    public void setEmStartime(String emStartime) {
        this.emStartime = emStartime == null ? null : emStartime.trim();
    }

    public Integer getEmDepartmentid() {
        return emDepartmentid;
    }

    public void setEmDepartmentid(Integer emDepartmentid) {
        this.emDepartmentid = emDepartmentid;
    }

    public String getEmTypework() {
        return emTypework;
    }

    public void setEmTypework(String emTypework) {
        this.emTypework = emTypework == null ? null : emTypework.trim();
    }

    public String getEmCreatime() {
        return emCreatime;
    }

    public void setEmCreatime(String emCreatime) {
        this.emCreatime = emCreatime == null ? null : emCreatime.trim();
    }

    public String getEmCreatename() {
        return emCreatename;
    }

    public void setEmCreatename(String emCreatename) {
        this.emCreatename = emCreatename == null ? null : emCreatename.trim();
    }

    public String getEmBz() {
        return emBz;
    }

    public void setEmBz(String emBz) {
        this.emBz = emBz == null ? null : emBz.trim();
    }

    public Employee(Integer id, String emSerialnumber, String emName,
                    String emSex, Integer emAge, String emIdcard, String emBorn,
                    String emNation, String emMarriage, String emVisage,
                    String emAncestralhome, String emTel, String emAddress,
                    String emAfterschool, String emSpeciality, String emCulture,
                    String emStartime, Integer emDepartmentid, String emTypework,
                    String emCreatime, String emCreatename, String emBz, String dtName) {
        super();
        this.id = id;
        this.emSerialnumber = emSerialnumber;
        this.emName = emName;
        this.emSex = emSex;
        this.emAge = emAge;
        this.emIdcard = emIdcard;
        this.emBorn = emBorn;
        this.emNation = emNation;
        this.emMarriage = emMarriage;
        this.emVisage = emVisage;
        this.emAncestralhome = emAncestralhome;
        this.emTel = emTel;
        this.emAddress = emAddress;
        this.emAfterschool = emAfterschool;
        this.emSpeciality = emSpeciality;
        this.emCulture = emCulture;
        this.emStartime = emStartime;
        this.emDepartmentid = emDepartmentid;
        this.emTypework = emTypework;
        this.emCreatime = emCreatime;
        this.emCreatename = emCreatename;
        this.emBz = emBz;
        this.dtName = dtName;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", emSerialnumber=" + emSerialnumber
                + ", emName=" + emName + ", emSex=" + emSex + ", emAge="
                + emAge + ", emIdcard=" + emIdcard + ", emBorn=" + emBorn
                + ", emNation=" + emNation + ", emMarriage=" + emMarriage
                + ", emVisage=" + emVisage + ", emAncestralhome="
                + emAncestralhome + ", emTel=" + emTel + ", emAddress="
                + emAddress + ", emAfterschool=" + emAfterschool
                + ", emSpeciality=" + emSpeciality + ", emCulture=" + emCulture
                + ", emStartime=" + emStartime + ", emDepartmentid="
                + emDepartmentid + ", emTypework=" + emTypework
                + ", emCreatime=" + emCreatime + ", emCreatename="
                + emCreatename + ", emBz=" + emBz + ", dtName=" + dtName + "]";
    }
}