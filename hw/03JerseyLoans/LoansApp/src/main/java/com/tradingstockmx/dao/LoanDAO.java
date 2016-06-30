package com.tradingstockmx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tradingstockmx.entity.LoanBean;

public class LoanDAO {
	

	public void addLoan(LoanBean loan){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		addLoan(session, loan);
		tx.commit();
		session.close();
	}
	
	private void addLoan(Session session, LoanBean loan){
		Loan tloan = new Loan();
		tloan.setLoanAmount(loan.getLoanAmount());
		tloan.setTerm(loan.getTerm());
		tloan.setName(loan.getName());
		tloan.setSurname(loan.getSurname());
		tloan.setPersonalId(loan.getPersonalId());
		
		session.save(tloan);
	}
	
	public List getLoans(String criteria){
		String hquery = "from Loan l where l.approved = 'T'";
		if (criteria!= null) hquery += " and l.personalId = 123" ;
		Session session = SessionUtil.getSession();
		Query query = session.createQuery(hquery);
		List loans = query.list();
		
		return loans;
	}
	
	
}
