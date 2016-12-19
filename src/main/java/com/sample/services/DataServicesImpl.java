package com.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.dao.DataDao;
import com.sample.dto.EmployeeDto;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(EmployeeDto employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	@Override
	public EmployeeDto getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<EmployeeDto> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
