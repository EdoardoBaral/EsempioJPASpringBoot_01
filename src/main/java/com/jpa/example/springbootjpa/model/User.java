package com.jpa.example.springbootjpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(nullable = false, columnDefinition = "integer default 0")
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
