package com.example.millgo.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.millgo.dto.Phone;
@Repository
public class PhoneDao {
//	ArrayList<Phone> myPhoneList;//추후에 db로 바뀔 예정
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.PhoneMapper.";
	
	public boolean addPhone(Phone p) {
		if(p == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertPhone", p);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Phone> getPhoneList() {
		return sqlSession.selectList(ns + "getTotalPhone");
	}
	
	public boolean deletePhone(Phone p) {
		try {
			sqlSession.delete(ns + "deletePhoneByModel", p);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updatePhone(Phone p) {
		try {
			sqlSession.update(ns + "updatePhone");
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
}