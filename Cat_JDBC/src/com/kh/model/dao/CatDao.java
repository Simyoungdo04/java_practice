package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.model.dto.Cat;

public class CatDao {
	private Properties prop = new Properties();

	public CatDao() {
		try { 
			prop.loadFromXML(new FileInputStream("resources/cat-mapper.xml"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public int insertCat(Connection conn, Cat cat) {
		int result = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertCat"))) {
			pstmt.setString(1, cat.getCatName());
			pstmt.setString(2, cat.getCatGender());
			pstmt.setDouble(3, cat.getCatWeight());
			
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Cat> selectCatList(Connection conn) {
		List<Cat> cats = new ArrayList<Cat>();
		try(PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("selectCatList"));
			ResultSet rset = pstmt.executeQuery()) {
			while(rset.next()) {
				Cat c = new Cat(rset.getInt("CAT_ID"), rset.getString("CAT_NAME"), rset.getString("CAT_GENDER"), rset.getDouble("CAT_WEIGHT"), rset.getDate("CAT_BIRTH"));
				cats.add(c);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return cats;
	}
	
}
