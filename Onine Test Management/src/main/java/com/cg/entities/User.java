package com.cg.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Long userID;
	private String userName;
	private Test userTest;
	private boolean admin;
	private String userPassword;
}
