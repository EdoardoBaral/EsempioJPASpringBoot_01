package com.jpa.example.springbootjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class User
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Column(name = "TEAM_NAME")
	private String teamName;
	private Integer salary;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	
	public Integer getSalary()
	{
		return salary;
	}
	
	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("{");
		sb.append("\"id\": "+ id +", ");
		sb.append("\"name\": \""+ name +"\", ");
		sb.append("\"teamName\": \""+ teamName +"\", ");
		sb.append("\"salary\": "+ salary);
		sb.append("}");
		
		return sb.toString();
	}
}
