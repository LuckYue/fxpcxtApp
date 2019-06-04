package com.fxpcxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fxpcxt.dao.IndustryAndHazardTypeMapper;
import com.fxpcxt.entity.IndustryAndHazardType;
import com.fxpcxt.service.IndustryAndHazardTypeService;

@Service("IndustryService")
public class IndustryAndHazardTypeServiceImpl implements IndustryAndHazardTypeService{
	@Autowired
	IndustryAndHazardTypeMapper industryAndHazardTypeMapper;

	@Override
	public void saveAll(List<IndustryAndHazardType> industryAndHazardTypes) {
		industryAndHazardTypeMapper.saveAll(industryAndHazardTypes);
	}
}