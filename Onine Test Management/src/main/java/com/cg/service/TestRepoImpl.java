package com.cg.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.entities.Test;

public class TestRepoImpl implements TestRepo {

	TestRepo repo;
	public TestRepoImpl() {
		repo=new TestRepoImpl();
	}
	@Override
	public Test addTest(Test test) {
		// TODO Auto-generated method stub
		return repo.addTest(test);
	}

	@Override
	public Test updateTest(BigInteger testId, Test test) {
		// TODO Auto-generated method stub
		return repo.updateTest(testId, test);
	}

	@Override
	public Test deleteTest(BigInteger TestId) {
		// TODO Auto-generated method stub
		return repo.deleteTest(TestId);
	}

	@Override
	public boolean assignTest(Long userId, BigInteger TestId) {
		// TODO Auto-generated method stub
		return repo.assignTest(userId, TestId);
	}

	@Override
	public BigDecimal getResult(Test test) {
		// TODO Auto-generated method stub
		return repo.getResult(test);
	}

}
