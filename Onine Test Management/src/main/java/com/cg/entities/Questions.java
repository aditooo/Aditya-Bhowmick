package com.cg.entities;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

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
public class Questions {
	private BigInteger questionId;
	private Array questionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private BigDecimal questionMarks;
	private Integer chosenAnswer;
	private BigDecimal marksScored;
}
