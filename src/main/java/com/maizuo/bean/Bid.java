package com.hyx.seatnew.domain;


public class Bid {
    private Integer id;

    private Integer bid;

    private String bidName;

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBidName() {
        return bidName;
    }

    public void setBidName(String bidName) {
        this.bidName = bidName == null ? null : bidName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getScheduleBid() {
        return scheduleBid;
    }

    public void setScheduleBid(Byte scheduleBid) {
        this.scheduleBid = scheduleBid;
    }

    public Byte getValidateIpFlag() {
        return validateIpFlag;
    }

    public void setValidateIpFlag(Byte validateIpFlag) {
        this.validateIpFlag = validateIpFlag;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps == null ? null : allowIps.trim();
    }

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}