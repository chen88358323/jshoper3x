package com.jshop.entity;

// Generated 2013-9-10 23:28:32 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemberT generated by hbm2java
 */
@Entity
@Table(name = "member_t", catalog = "jshoper3")
public class MemberT implements java.io.Serializable {

	private String id;
	private String loginname;
	private String loginpwd;
	private String nick;
	private String realname;
	private String city;
	private String district;
	private String sex;
	private String whichsex;
	private String merrystatus;
	private String birthday;
	private String blood;
	private String constellation;
	private String des;
	private String email;
	private String qq;
	private String weixin;
	private String sinaweibo;
	private String tag;
	private Integer belove;
	private Integer loveother;
	private Integer postingcount;
	private String question;
	private String answer;
	private String userstate;
	private String headpath;

	public MemberT() {
	}

	public MemberT(String id, String loginname, String loginpwd, String nick) {
		this.id = id;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.nick = nick;
	}

	public MemberT(String id, String loginname, String loginpwd, String nick,
			String realname, String city, String district, String sex,
			String whichsex, String merrystatus, String birthday, String blood,
			String constellation, String des, String email, String qq,
			String weixin, String sinaweibo, String tag, Integer belove,
			Integer loveother, Integer postingcount, String question,
			String answer, String userstate, String headpath) {
		this.id = id;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.nick = nick;
		this.realname = realname;
		this.city = city;
		this.district = district;
		this.sex = sex;
		this.whichsex = whichsex;
		this.merrystatus = merrystatus;
		this.birthday = birthday;
		this.blood = blood;
		this.constellation = constellation;
		this.des = des;
		this.email = email;
		this.qq = qq;
		this.weixin = weixin;
		this.sinaweibo = sinaweibo;
		this.tag = tag;
		this.belove = belove;
		this.loveother = loveother;
		this.postingcount = postingcount;
		this.question = question;
		this.answer = answer;
		this.userstate = userstate;
		this.headpath = headpath;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "LOGINNAME", nullable = false, length = 100)
	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@Column(name = "LOGINPWD", nullable = false, length = 36)
	public String getLoginpwd() {
		return this.loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	@Column(name = "NICK", nullable = false, length = 45)
	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Column(name = "REALNAME", length = 45)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "CITY", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "DISTRICT", length = 20)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "WHICHSEX", length = 1)
	public String getWhichsex() {
		return this.whichsex;
	}

	public void setWhichsex(String whichsex) {
		this.whichsex = whichsex;
	}

	@Column(name = "MERRYSTATUS", length = 1)
	public String getMerrystatus() {
		return this.merrystatus;
	}

	public void setMerrystatus(String merrystatus) {
		this.merrystatus = merrystatus;
	}

	@Column(name = "BIRTHDAY", length = 45)
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "BLOOD", length = 20)
	public String getBlood() {
		return this.blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	@Column(name = "CONSTELLATION", length = 20)
	public String getConstellation() {
		return this.constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	@Column(name = "DES", length = 500)
	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "QQ", length = 100)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "WEIXIN", length = 100)
	public String getWeixin() {
		return this.weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	@Column(name = "SINAWEIBO", length = 100)
	public String getSinaweibo() {
		return this.sinaweibo;
	}

	public void setSinaweibo(String sinaweibo) {
		this.sinaweibo = sinaweibo;
	}

	@Column(name = "TAG", length = 100)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "BELOVE")
	public Integer getBelove() {
		return this.belove;
	}

	public void setBelove(Integer belove) {
		this.belove = belove;
	}

	@Column(name = "LOVEOTHER")
	public Integer getLoveother() {
		return this.loveother;
	}

	public void setLoveother(Integer loveother) {
		this.loveother = loveother;
	}

	@Column(name = "POSTINGCOUNT")
	public Integer getPostingcount() {
		return this.postingcount;
	}

	public void setPostingcount(Integer postingcount) {
		this.postingcount = postingcount;
	}

	@Column(name = "QUESTION", length = 45)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "ANSWER", length = 45)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "USERSTATE", length = 1)
	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	@Column(name = "HEADPATH")
	public String getHeadpath() {
		return this.headpath;
	}

	public void setHeadpath(String headpath) {
		this.headpath = headpath;
	}

}
