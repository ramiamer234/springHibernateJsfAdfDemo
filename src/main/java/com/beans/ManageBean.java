package com.beans;

import java.io.Serializable;

//@ManagedBean和 @Component都可以
//@Component
//@ViewScoped
public class ManageBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8493633778009081135L;
	private String code;
	private String name;

	public String getCode() {
		return "425300";
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return "yixz";
	}
	public void setName(String name) {
		this.name = name;
	}
}
