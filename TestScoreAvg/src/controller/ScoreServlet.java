package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Score;
import java.sql.Timestamp;

/**
 * Servlet implementation class Score
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String score = request.getParameter("score");
		String action;
	
		Score scr = new Score();
		BigDecimal temp = new BigDecimal(score);
		scr.setTestscore(temp);
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		scr.setScoredate(Date(sdf));
		sdf = new SimpleDateFormat("HH/mm");
		
		Timestamp tstamp = new Timestamp(date.getTime());
		scr.setScoretime(tstamp);
		action = (String) request.getParameter("action");
		
		System.out.println(action);
		if(action.contentEquals("add")){
			
			TestScoreDB.insert(scr);
			 response.sendRedirect(response.encodeRedirectURL(
			            "/TestScoreAvg/index.jsp"));
		}
	}

	private Date Date(SimpleDateFormat sdf) {
		// TODO Auto-generated method stub
		return null;
	}
}
