package com.ww.model;

/**
 * 招聘信息 实体类
 * 
 * @author dell
 *
 */
public class Invitejob {
	//编号
	private Integer id;
	//招聘人员姓名
	private String name;
	//招聘人员性别
	private String sex;
	//招聘人员年龄
	private Integer age;
	//招聘人员出生日期
	private String born;
	//招聘人员职位
	private String job;
	//招聘人员专业
	private String specialty;
	//招聘人员有无工作经验
	private String experience;
	//招聘人员文化程度
	private String teachschool;
	//招聘人员毕业学校
	private String afterschool;
	//招聘人员电话
	private String tel;
	//招聘人员地址
	private String address;
	//招聘人员上岗时间
	private String createtime;
	//招聘人员录用状态
	private int isstock;
	//招聘人员描述
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born == null ? null : born.trim();
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job == null ? null : job.trim();
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty == null ? null : specialty.trim();
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience == null ? null : experience.trim();
	}

	public String getTeachschool() {
		return teachschool;
	}

	public void setTeachschool(String teachschool) {
		this.teachschool = teachschool == null ? null : teachschool.trim();
	}

	public String getAfterschool() {
		return afterschool;
	}

	public void setAfterschool(String afterschool) {
		this.afterschool = afterschool == null ? null : afterschool.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime == null ? null : createtime.trim();
	}

	public int getIsstock() {
		return isstock;
	}

	public void setIsstock(int isstock) {
		this.isstock = isstock;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Invitejob(Integer id, String name, String sex, Integer age,
			String born, String job, String specialty, String experience,
			String teachschool, String afterschool, String tel, String address,
			String createtime, int isstock, String content) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.born = born;
		this.job = job;
		this.specialty = specialty;
		this.experience = experience;
		this.teachschool = teachschool;
		this.afterschool = afterschool;
		this.tel = tel;
		this.address = address;
		this.createtime = createtime;
		this.isstock = isstock;
		this.content = content;
	}

	public Invitejob() {
		super();
	}

	@Override
	public String toString() {
		return "Invitejob [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", born=" + born + ", job=" + job
				+ ", specialty=" + specialty + ", experience=" + experience
				+ ", teachschool=" + teachschool + ", afterschool="
				+ afterschool + ", tel=" + tel + ", address=" + address
				+ ", createtime=" + createtime + ", isstock=" + isstock
				+ ", content=" + content + "]";
	}
	
}