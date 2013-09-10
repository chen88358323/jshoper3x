package com.jshop.entity;

// Generated 2013-9-10 23:28:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsBelinkedT generated by hbm2java
 */
@Entity
@Table(name = "goods_belinked_t", catalog = "jshoper3")
public class GoodsBelinkedT implements java.io.Serializable {

	private String belinkedid;
	private String maingoodsid;
	private String belinkedgoods;
	private String mode;
	private String state;
	private String creatorid;
	private Date createtime;
	private Date updatetime;
	private int versiont;
	private String sxlinkedgoodsid;

	public GoodsBelinkedT() {
	}

	public GoodsBelinkedT(String belinkedid, String maingoodsid,
			String belinkedgoods, String mode, String state, String creatorid,
			Date createtime, Date updatetime, int versiont,
			String sxlinkedgoodsid) {
		this.belinkedid = belinkedid;
		this.maingoodsid = maingoodsid;
		this.belinkedgoods = belinkedgoods;
		this.mode = mode;
		this.state = state;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

	@Id
	@Column(name = "BELINKEDID", unique = true, nullable = false, length = 20)
	public String getBelinkedid() {
		return this.belinkedid;
	}

	public void setBelinkedid(String belinkedid) {
		this.belinkedid = belinkedid;
	}

	@Column(name = "MAINGOODSID", nullable = false, length = 20)
	public String getMaingoodsid() {
		return this.maingoodsid;
	}

	public void setMaingoodsid(String maingoodsid) {
		this.maingoodsid = maingoodsid;
	}

	@Column(name = "BELINKEDGOODS", nullable = false, length = 500)
	public String getBelinkedgoods() {
		return this.belinkedgoods;
	}

	public void setBelinkedgoods(String belinkedgoods) {
		this.belinkedgoods = belinkedgoods;
	}

	@Column(name = "MODE", nullable = false, length = 1)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "SXLINKEDGOODSID", nullable = false, length = 20)
	public String getSxlinkedgoodsid() {
		return this.sxlinkedgoodsid;
	}

	public void setSxlinkedgoodsid(String sxlinkedgoodsid) {
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

}
