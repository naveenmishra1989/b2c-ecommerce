package com.ecommerce.service.impl;

import java.util.List;

import com.ecommerce.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Color;
import com.ecommerce.repository.ColorRepository;

@Service
public class ColorServiceImpl implements ColorService {
	
	@Autowired
	ColorRepository colorRepository;

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}
	
}
