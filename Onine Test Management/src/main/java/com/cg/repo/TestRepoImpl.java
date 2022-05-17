package com.cg.repo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.cg.entities.Test;
import com.cg.entities.User;

public class TestRepoImpl implements TestRepo {
	User obj=new User();
	List<Test> testList;
	List<User> userList;
	public TestRepoImpl() {
		testList = new ArrayList<>();
		userList = new ArrayList<>();
	}
	@Override
	public Test addTest(Test test) {
		if(obj.isAdmin())
		{
			testList.add(test);
		}
		return test;
	}

	@Override
	public Test updateTest(BigInteger testId, Test test) {
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(testId==testList.get(i).getTestId())
				{
					testList.set(i, test);
				}
			}
		}
		return test;
	}

	@Override
	public Test deleteTest(BigInteger TestId) {
		Test id=null;
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(TestId==testList.get(i).getTestId())
				{
					id=testList.get(i);
					try
					{
						testList.remove(i);
					}
					catch(Exception e)
					{						
					}
				}
			}
		}
		return id;
	}

	@Override
	public boolean assignTest(Long userId, BigInteger TestId) {
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(TestId==testList.get(i).getTestId())
				{
					for(int j=0;j<userList.size();j++)
					{
						if(userId==userList.get(j).getUserID())
						{
							return true;
						}
					}
					
				}
			}
		}
		return false;
	}

	@Override
	public BigDecimal getResult(Test test) {
			return test.getTestTotalMarks();
	}

}
