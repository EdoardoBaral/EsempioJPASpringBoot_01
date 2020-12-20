package com.jpa.example.springbootjpa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Column(name = "TEAM_NAME")
	private String teamName;
	private Integer salary;
	
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
