package com.ww.model;

/**
 * 薪资信息 实体类
 * 
 * @author dell
 *
 */
public class Pay {
	//主键
    private Integer id;
    //编号
    private String payEmnumber;
    //员工姓名
    private String payEmname;
    //当前月份
    private String payMonth;
    //基本工资
    private Integer payBasemoney;
    //加班费
    private Integer payOvertime;
    //工龄费
    private Integer payAge;
    //考勤费
    private Float payCheck;
    //旷工费
    private Float payAbsent;
    //保险费
    private Float paySafety;

    private Integer pay;
    
    public Integer getPay() {
		return pay;
	}

	public void setPay(Integer pay) {
		this.pay = pay;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayEmnumber() {
        return payEmnumber;
    }

    public void setPayEmnumber(String payEmnumber) {
        this.payEmnumber = payEmnumber == null ? null : payEmnumber.trim();
    }

    public String getPayEmname() {
        return payEmname;
    }

    public void setPayEmname(String payEmname) {
        this.payEmname = payEmname == null ? null : payEmname.trim();
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth == null ? null : payMonth.trim();
    }

    public Integer getPayBasemoney() {
        return payBasemoney;
    }

    public void setPayBasemoney(Integer payBasemoney) {
        this.payBasemoney = payBasemoney;
    }

    public Integer getPayOvertime() {
        return payOvertime;
    }

    public void setPayOvertime(Integer payOvertime) {
        this.payOvertime = payOvertime;
    }

    public Integer getPayAge() {
        return payAge;
    }

    public void setPayAge(Integer payAge) {
        this.payAge = payAge;
    }

    public Float getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(Float payCheck) {
        this.payCheck = payCheck;
    }

    public Float getPayAbsent() {
        return payAbsent;
    }

    public void setPayAbsent(Float payAbsent) {
        this.payAbsent = payAbsent;
    }

    public Float getPaySafety() {
        return paySafety;
    }

    public void setPaySafety(Float paySafety) {
        this.paySafety = paySafety;
    }

	@Override
	public String toString() {
		return "Pay [id=" + id + ", payEmnumber=" + payEmnumber
				+ ", payEmname=" + payEmname + ", payMonth=" + payMonth
				+ ", payBasemoney=" + payBasemoney + ", payOvertime="
				+ payOvertime + ", payAge=" + payAge + ", payCheck=" + payCheck
				+ ", payAbsent=" + payAbsent + ", paySafety=" + paySafety
				+ ", pay=" + pay + "]";
	}

	public Pay(Integer id, String payEmnumber, String payEmname,
			String payMonth, Integer payBasemoney, Integer payOvertime,
			Integer payAge, Float payCheck, Float payAbsent, Float paySafety,
			Integer pay) {
		super();
		this.id = id;
		this.payEmnumber = payEmnumber;
		this.payEmname = payEmname;
		this.payMonth = payMonth;
		this.payBasemoney = payBasemoney;
		this.payOvertime = payOvertime;
		this.payAge = payAge;
		this.payCheck = payCheck;
		this.payAbsent = payAbsent;
		this.paySafety = paySafety;
		this.pay = pay;
	}

	public Pay() {
		super();
	}
    
    
}