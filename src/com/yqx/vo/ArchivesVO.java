package com.yqx.vo;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class ArchivesVO {

	private int id; //����id
	private String empname;//Ա�����
	private String code;//�������
	private String name;//��������
	private String content;//��������
	private String type;//��������
	private String remark;//��ע˵��
	@JSONField(format="yyyy-MM-dd HH:mm:ssS")
	private Timestamp createTime;//����ʱ��
	
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
