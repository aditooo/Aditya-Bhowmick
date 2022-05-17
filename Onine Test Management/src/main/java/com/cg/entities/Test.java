package com.cg.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

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
public class Test {
	private BigInteger testId;
	private String testTitle;
	private LocalTime testDuration;
	private Set<Questions> testQuestions;
	private BigDecimal testTotalMarks;
	private Questions testMarksScored;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
}