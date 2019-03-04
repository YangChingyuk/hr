package com.yqx.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class RewardsVO {

	private int id;//奖励编号
	private String empname;//员工编号
	private String title;//奖惩标题
	private String content;//奖惩内容
	private int type;//奖金类别
	@JSONField(format="yyyy-MM-dd")
	private Date creatDate;//奖惩时间
	
	public RewardsVO(int id, String empname, String title, String content, int type, Date creatDate) {
		super();
		this.id = id;
		this.empname = empname;
		this.title = title;
		this.content = content;
		this.type = type;
		this.creatDate = creatDate;
	}
	public RewardsVO() {
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "RewardsVO [id=" + id + ", empname=" + empname + ", title=" + title + ", content=" + content + ", type="
				+ type + ", creatDate=" + creatDate + "]";
	}
	
}
