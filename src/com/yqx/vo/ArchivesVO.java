package com.yqx.vo;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class ArchivesVO {

	private int id; //档案id
	private String empname;//员工编号
	private String code;//档案编号
	private String name;//档案名称
	private String content;//档案内容
	private String type;//档案类型
	private String remark;//备注说明
	@JSONField(format="yyyy-MM-dd HH:mm:ssS")
	private Timestamp createTime;//创建时间
	
	public ArchivesVO(int id, String empname, String code, String name, String content, String type, String remark,
			Timestamp createTime) {
		super();
		this.id = id;
		this.empname = empname;
		this.code = code;
		this.name = name;
		this.content = content;
		this.type = type;
		this.remark = remark;
		this.createTime = createTime;
	}
	public ArchivesVO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "ArchivesVO [id=" + id + ", empname=" + empname + ", code=" + code + ", name=" + name + ", content="
				+ content + ", type=" + type + ", remark=" + remark + ", createTime=" + createTime + "]";
	}
	
	
}
