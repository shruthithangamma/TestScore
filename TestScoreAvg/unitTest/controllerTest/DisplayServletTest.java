package controllerTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import model.Score;

import org.junit.Test;

import tools.DBUtil;

public class DisplayServletTest {

	@Test
	public void test() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try{
			Score scr = em.find(Score.class, "1");
			assertEquals(new BigDecimal("1"), scr.getTestscore());
		}catch(Exception e){
			fail("Not yet implemented"+e.getMessage());
			
		}finally{
			em.close();
		}
		
	}

}
