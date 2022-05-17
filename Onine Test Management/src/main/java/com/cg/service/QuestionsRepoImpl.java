package com.cg.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.entities.Questions;

public class QuestionsRepoImpl implements QuestionsRepo {

	QuestionsRepo repo;
	public QuestionsRepoImpl() {
		repo=new QuestionsRepoImpl();
	}
	@Override
	public Questions addQuestions(BigInteger TestId, Questions questions) {
		// TODO Auto-generated method stub
		return repo.addQuestions(TestId, questions);
	}

	@Override
	public Questions updateQuestions(BigInteger TestId, Questions questions) {
		// TODO Auto-generated method stub
		return repo.updateQuestions(TestId, questions);
	}

	@Override
	public Questions deleteQuestions(BigInteger TestId, Questions questions) {
		// TODO Auto-generated method stub
		return repo.deleteQuestions(TestId, questions);
	}

	@Override
	public BigDecimal calculateTotalMarks() {
		// TODO Auto-generated method stub
		return repo.calculateTotalMarks();
	}

}
