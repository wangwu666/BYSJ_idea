package com.ww.model;

/**
 * 部门 实体类
 * 
 * @author dell
 *
 */
public class Department {
	//主键
    private Integer id;
    //部门名称
    private String dtName;
    //部门创建时间
    private String dtCreatetime;
    //部门责任
    private String dtBz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName == null ? null : dtName.trim();
    }

    public String getDtCreatetime() {
        return dtCreatetime;
    }

    public void setDtCreatetime(String dtCreatetime) {
        this.dtCreatetime = dtCreatetime == null ? null : dtCreatetime.trim();
    }

    public String getDtBz() {
        return dtBz;
    }

    public void setDtBz(String dtBz) {
        this.dtBz = dtBz == null ? null : dtBz.trim();
    }

    
    
	public Department() {
		super();
	}

	public Department(Integer id, String dtName, String dtCreatetime,
			String dtBz) {
		super();
		this.id = id;
		this.dtName = dtName;
		this.dtCreatetime = dtCreatetime;
		this.dtBz = dtBz;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dtName=" + dtName
				+ ", dtCreatetime=" + dtCreatetime + ", dtBz=" + dtBz + "]";
	}
    
    
}