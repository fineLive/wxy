package com.helloOne.sys.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Administrator
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String password;

	private Date createTime;

	private Date updateTime;
	private Integer delFlag;// 'É¾³ý±ê¼Ç£¨0 Î´É¾³ý 1 ÒÑÉ¾³ý£©
	private String email;
	private String avatar; // Í·ÏñµØÖ·

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", delFlag=" + delFlag + ", email=" + email + ", avatar=" + avatar
				+ "]";
	}

}
