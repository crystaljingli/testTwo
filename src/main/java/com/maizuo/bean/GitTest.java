package com.maizuo.bean;

public class GitTest {
    private String gitName;
    private String gitVersion;
    private String gitPrice;
	public String getGitName() {
		return gitName;
	}
	public void setGitName(String gitName) {
		this.gitName = gitName;
	}
	public String getGitVersion() {
		return gitVersion;
	}
	public void setGitVersion(String gitVersion) {
		this.gitVersion = gitVersion;
	}
	public String getGitPrice() {
		return gitPrice;
	}
	public void setGitPrice(String gitPrice) {
		this.gitPrice = gitPrice;
	}
	@Override
	public String toString() {
		return "GitTest [gitName=" + gitName + ", gitVersion=" + gitVersion
				+ ", gitPrice=" + gitPrice + "]";
	}
    
    

}
