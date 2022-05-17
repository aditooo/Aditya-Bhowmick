package com.cg.repo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.cg.entities.Questions;
import com.cg.entities.Test;
import com.cg.entities.User;

public class QuestionsRepoImpl implements QuestionsRepo {
	
	User obj=new User();
	List<Test> testList;
	List<Questions> queList;
	public QuestionsRepoImpl() {
		queList = new ArrayList<>();
		testList = new ArrayList<>();
	}

	@Override
	public Questions addQuestions(BigInteger TestId, Questions questions) {
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(TestId==testList.get(i).getTestId())
				{
					queList.add(questions);
				}
			}
		}
		return questions;
	}

	@Override
	public Questions updateQuestions(BigInteger TestId, Questions questions) {	
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(TestId==testList.get(i).getTestId())
				{
					queList.set(i, questions);
				}
			}
		}
		return questions;
	}

	@Override
	public Questions deleteQuestions(BigInteger TestId, Questions questions) {
		if(obj.isAdmin())
		{
			for(int i=0;i<testList.size();i++)
			{
				if(TestId==testList.get(i).getTestId())
				{
					try
					{
						queList.remove(i);
					}
					catch(Exception e)
					{						
					}
				}
			}
		}
		return questions;
	}
	
	@Override
	public BigDecimal calculateTotalMarks() {
		BigDecimal marks = null;
		for(int i=0;i<testList.size();i++)
		{
			for(int j=0;j<queList.size();j++)
			{
				marks=marks.add(queList.get(j).getMarksScored());
			}
		}
		return marks;
	}

}
