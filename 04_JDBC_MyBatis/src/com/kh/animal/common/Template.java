package com.kh.animal.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	// Connection 객체 생성 없이
	// SqlSession 객체를 만드는 메소드를 구현할 것
	
	public static SqlSession getSqlSession() {
		
		SqlSession sqlSession = null;
		
		// mybatis-config.xml파일에 작성한 environmet요소의 내용을 읽어와서
		// 해당 DB와 연결된 SqlSession객체 생성
		
		String config = "mybatis-config.xml";
		try {
			InputStream stream = Resources.getResourceAsStream(config);
			
			// 1. SqlSessctionFactoryBuilder 만들기
			// 만드는 법 : 기본생성자 호출
			// new SqlSessionFactoryBuilder();
			// 2. SqlSecctionFactory 만들기
			// 만드는 법 : Builder를 참조해서 메소들르 호출한
			// .build(접속 내용을 담은 파일을 읽어온 입력스트림);
			// new SqlSessionFactoryBuilder().build(stream);
			// 3. SqlSesstion 만들기
			// 만드는 법 : Factory를 참조해서 메소드를 호출한다.
			// .openSesstion();
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSession;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
