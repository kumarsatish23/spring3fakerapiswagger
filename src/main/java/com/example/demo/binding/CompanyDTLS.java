package com.example.demo.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDTLS {
	private String id;
	private String name;
	private String location;
	private String grossRevenu;
	private String employeeCount;
	private String boardMemberCount;
	private Boolean multinational;
	private String industry;
}