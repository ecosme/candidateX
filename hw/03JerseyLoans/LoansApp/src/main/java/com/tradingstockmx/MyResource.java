package com.tradingstockmx;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tradingstockmx.dao.Loan;
import com.tradingstockmx.dao.LoanDAO;
import com.tradingstockmx.entity.LoanBean;

/**
 * Root resource (exposed at "loans" path)
 */
@Path("/loans")
public class MyResource {
   
	@POST 
	@Path("/create")
	@Consumes("application/json")
	public Response addLoan(LoanBean loan){
		loan.setLoanAmount(loan.getLoanAmount());
		loan.setName(loan.getName());
		loan.setTerm(loan.getTerm());
		loan.setSurname(loan.getSurname());
		loan.setPersonalId(loan.getPersonalId());
		
		LoanDAO loandao = new LoanDAO();
		loandao.addLoan(loan);
		
		return Response.ok().build();
	}
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
		String criteria = null;
		criteria = "user"; 
		List<Loan> mloans = getLoans();
		String txtloans ="";
		for (Loan ln : mloans) txtloans += "\n" + ln.getName() + " " +ln.getId();
        return "Rising Loan..." + txtloans + " Got it!";
    }

	@GET
	@Produces("application/json")
	public List<Loan> getLoans(){
		String criteria = "user";
		LoanDAO loandao = new LoanDAO();
		List loans = loandao.getLoans(criteria);
		
		return loans;
	}
	
	
}
