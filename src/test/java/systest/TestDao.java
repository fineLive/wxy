package systest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.helloOne.sys.dao.UserDao;
import com.helloOne.sys.entity.User;



public class TestDao extends BaseTest{
	
	
	
		@Test
		public void test1() throws SQLException{
		
			//获取DataSource
			DataSource ds = ac.getBean(
					"druid",DataSource.class);
			
			Connection con = ds.getConnection();
			System.out.println(con);
			con.close();
			//获取SqlSessionFactory
			SqlSessionFactory factory = 
			ac.getBean("ssf",SqlSessionFactory.class);
			
			//获取UserDao
			UserDao dao = ac.getBean(
					"userDao",UserDao.class);
			
			List<User> users = dao.findAll();
			for(User user:users){
				System.out.println(user.toString());	
			}
			
		
	
	}
	

}
