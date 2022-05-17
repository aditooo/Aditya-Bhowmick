package com.cg.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.entities.Test;

public interface TestRepo {
	Test addTest(Test test);
	Test updateTest(BigInteger testId, Test test);
	Test deleteTest(BigInteger TestId);
	boolean assignTest(Long userId, BigInteger TestId); 
	BigDecimal getResult(Test test);
}
