package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {

	
	private int rollno;
	@JsonIgnore
	private int rank;
	
	private String name;
	
	public StudentResponse(int rollno,int rank,String name) {
		this.setRollno(rollno);
		this.setRank(rank);
		this.setName(name);
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}