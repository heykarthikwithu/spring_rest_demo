package com.sample.dao;

import java.util.List;

import com.sample.dto.EmployeeDto;

public interface DataDao {

	public boolean addEntity(EmployeeDto employee) throws Exception;
	public EmployeeDto getEntityById(long id) throws Exception;
	public List<EmployeeDto> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
