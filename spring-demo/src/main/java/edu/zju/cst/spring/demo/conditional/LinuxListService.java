package edu.zju.cst.spring.demo.conditional;

public class LinuxListService implements ListService{
	@Override
	public String showListCmd() {
		return "ls";
	}
}
