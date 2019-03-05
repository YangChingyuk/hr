package com.yqx.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ResumeVO {

	private int id;//�������
	private String empname;//Ա�����
	private String orgname;//����
	private String job;//ְλ
	private String edu;//ѧ��
	private String content;//��������
	private String result;//ҵ��
	@JSONField(format="yyyy-MM-dd")
	private Date beginDate;//��ʼʱ��
	@JSONField(format="yyyy-MM-dd")
	private Date endDate;//����ʱ��
	
	public ResumeVO(int id, String empname, String orgname, String job, String edu, String content, String result,
			Date beginDate, Date endDate) {
		super();
		this.id = id;
		this.empname = empname;
		this.orgname = orgname;
		this.job = job;
		this.edu = edu;
		this.content = content;
		this.result = result;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	public ResumeVO() {
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
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "ResumeVO [id=" + id + ", empname=" + empname + ", orgname=" + orgname + ", job=" + job + ", edu=" + edu
				+ ", content=" + content + ", result=" + result + ", beginDate=" + beginDate + ", endDate=" + endDate
				+ "]";
	}
	
}
