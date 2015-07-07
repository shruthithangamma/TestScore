package controller;
import java.util.List;

import tools.DBUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Score;

public class TestScoreDB {
	
	public static void insert(Score scr){
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();	
		try{
			trans.begin();
			em.persist(scr);
			trans.commit();
		}catch(Exception e){
			System.out.println(e);
			trans.rollback();
		}finally{
			em.close();
		}		
	}
	
	
	public static List<Score> getAllScores(){
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		//EntityTransaction trans = em.getTransaction();
		List<Score> scoreList = null;
		String queryString = "SELECT C FROM Score C";
		TypedQuery<Score> typeQue = em.createQuery(queryString, Score.class);
		try{
			scoreList = typeQue.getResultList();
			if(scoreList == null || scoreList.isEmpty())
				scoreList = null;
			
		}catch(Exception e){
			System.out.println(e);
			
		}
			finally{
			em.close();
		}return scoreList;
	}

}
