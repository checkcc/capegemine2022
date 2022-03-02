package com.demo.logic;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;

public class Service {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;
	Session sessiong = null;

	public void MutipleQestionAnwer() {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		sessiong = sessionFactory.openSession();

		// begin transcation
		transcation = sessiong.beginTransaction();

		List<Answer> list1 = new ArrayList<Answer>();

		// adding question 1
		Question question1 = new Question();
		question1.setQname("what is java");

		// mutilple choice possible answers to question 1
		Answer ans1 = new Answer();
		ans1.setAnswername("java is prog languague");

		Answer ans2 = new Answer();
		ans2.setAnswername("java is platform  indep");
		ans2.setPostedBy("ravi");

		Answer ans3 = new Answer();
		ans3.setAnswername("java is internet  languague");

		Answer ans4 = new Answer();
		ans4.setAnswername("java is oops");
		// adding anwers to list
		list1.add(ans1);
		list1.add(ans2);
		list1.add(ans3);
		list1.add(ans4);

		// set the list to question 1
		question1.setAnswers(list1);

		sessiong.save(question1);// added or insert into db or persist

		transcation.commit();

	}

}
