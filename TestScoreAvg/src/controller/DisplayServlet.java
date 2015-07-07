package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Score;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
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
		List<Score> scoreList = TestScoreDB.getAllScores();
		//System.out.println(scoreList);
		Double total = 0.0;
		for(int i=0; i<=scoreList.size()-1; i++){
			
			total = total+scoreList.get(i).getTestscore().doubleValue();
			System.out.println(total);
		}
		
		Double average = total / scoreList.size();
		request.setAttribute("scoreList", scoreList);
		request.setAttribute("total", total);
		request.setAttribute("average", average);
		
		getServletContext().getRequestDispatcher("/DisplayScore.jsp").forward(request, response);
		

	}

}
