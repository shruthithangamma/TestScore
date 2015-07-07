package controllerTest;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;


import model.Score;

import org.junit.Test;


import tools.DBUtil;

public class ScoreServletTest {

	@Test
	public void test() {
		
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			try{
				Score scr = em.find(Score.class, "351" );
				assertEquals("351", scr.getId());
			}catch(Exception e){
				fail("Not yet implemented"+e.getMessage());
				
			}finally{
				em.close();
			}
		}
		
		
		
	}

