package com.example.millgo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.millgo.dao.PhoneDao;
import com.example.millgo.dto.Phone;

@Service
public class PhoneService {
	@Autowired
	PhoneDao phoneDao;
	
	public List<Phone> getAllPhone() {
		List<Phone> phones = phoneDao.getPhoneList();
		return phones;
	}
	public boolean insertPhone(Phone p) {
		return phoneDao.addPhone(p);
	}
	public boolean updatePhone(Phone p) {
		return phoneDao.updatePhone(p);
	}
	public boolean deletePhone(Phone p) {
		return phoneDao.deletePhone(p);
	}
}