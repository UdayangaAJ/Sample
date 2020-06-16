package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public class EmpDao {
	@Autowired
	JdbcTemplate template;//Bean object can not inject noraml object

	public boolean add(Employee e) {
		// bean configuration three ways xml,annotaion,java configuration
		Object[] args = { e.getId(), e.getName(), e.getSal() };
		int result = template.update("insert into emp values(?,?,?)", args);
		if(result == 1) return true;
		else return false;
	}
}
