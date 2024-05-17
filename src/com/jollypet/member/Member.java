package com.jollypet.member;

public class Member { // DTO Data Transfer Object 클래스, VO (Value Object) 클래스

	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Member(String id, String pw, String name, String email, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
//	public void setId(String id) { // setter 세터
//		this.id = id;
//	}
//	public String getId() { // getter
//		return this.id;
//	}
	
	
}
