package com.cg.repo;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.entities.Questions;

public interface QuestionsRepo {
	Questions addQuestions(BigInteger TestId,Questions questions);
	Questions updateQuestions(BigInteger TestId,Questions questions);
	Questions deleteQuestions(BigInteger TestId,Questions questions);
	BigDecimal calculateTotalMarks();
}

