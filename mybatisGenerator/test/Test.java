package test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.test.springmvc.dao.mapper.ProductMapper;
import com.my.test.springmvc.dao.mapper.UserMapper;

public class Test {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = sqlSessionFactory.openSession();

		// UserBean user =
		// session.selectOne("com.my.mybatistest.mapper.UserBeanMapper", 1);
		// System.out.println(user.getUseraddress());
		// System.out.println(user.getUsername());

		ProductMapper productMapper = session.getMapper(ProductMapper.class);
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		
		// 增加产品
//		Product p = new Product();
//		p.setProductId(1);
//		p.setPrice(100);
//		p.setName("黄瓜");
//		Product p1 = new Product();
//		p1.setProductId(2);
//		p1.setPrice(300);
//		p1.setName("面膜");
//		
//		mapper.insert(p);
//		mapper.insert(p1);
//		session.commit();
		
//		Product 电视;
//		电视 = new Product();
		
		// 查询产品
//		Product p = mapper.selectByPrimaryKey(2);
//		System.out.println(p);
		
//		ProductExample example = new ProductExample();
//		example.setOrderByClause("price desc");
//		
//		List<Product> list = mapper.selectByExample(example);
//		for (Product product : list) {
//			System.out.println(product);
//		}
		
//		mapper.deleteByPrimaryKey(2);
		
//		mapper.updateByPrimaryKey(null);
		
		long count = productMapper.countByExample(null);
		System.out.println(count);
		
		session.close();
	}
}
