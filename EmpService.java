package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpDao;
import com.nt.entity.Employee;

@Service
public class EmpService {
	@Autowired
	EmpDao dao;
	public boolean add(Employee e){
		return dao.add(e);
	}
}
