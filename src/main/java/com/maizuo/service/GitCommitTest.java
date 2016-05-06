package com.maizuo.service;

import java.util.ArrayList;
import java.util.List;

import com.maizuo.bean.GitTest;

public class GitCommitTest {
  public static void main(String[] args) {
	  List<GitTest> gitTestList = new ArrayList<GitTest>();
	//此处代码留有另一个人编写（E://workspace）
	  GitTest gitTest = new GitTest();
	  gitTest.setGitName("ysyyy");
	//此处代码由（E://workspace）完成
	  gitTest.setGitPrice("12345");
	  gitTest.setGitVersion("10.10");
	  gitTestList.add(gitTest);
	  System.out.println("This is a Test!");
	  System.out.println("This is a Test!");
	  System.out.println("This is a Test!");
 }
}
