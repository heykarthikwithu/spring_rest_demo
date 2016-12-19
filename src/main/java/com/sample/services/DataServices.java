package com.sample.services;

import java.util.List;

import com.sample.dto.EmployeeDto;
import com.sample.model.Employee;

public interface DataServices {
	public boolean addEntity(EmployeeDto employee) throws Exception;
	public EmployeeDto getEntityById(long id) throws Exception;
	public List<EmployeeDto> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
