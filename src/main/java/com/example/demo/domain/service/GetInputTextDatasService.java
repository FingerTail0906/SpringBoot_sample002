package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.bean.InputTextDatasBean;
import com.example.demo.domain.entity.InputTextDatasEntity;
import com.example.demo.domain.repository.InputTextDatasRepository;


@Service
public class GetInputTextDatasService {
	
	@Autowired
	InputTextDatasRepository inputTextDatasRepository;
	
	
	public List<InputTextDatasBean> getAllDatas() {
		
		
		List<InputTextDatasEntity> listInputTextDatasEntity = inputTextDatasRepository.findAll();
		List<InputTextDatasBean> listInputTextDatasBean = new ArrayList();
		
		listInputTextDatasEntity.forEach(inputTextDatasEntity -> {
			InputTextDatasBean inputTextDatasBean = new InputTextDatasBean();
			inputTextDatasBean.setId(inputTextDatasEntity.getId());
			inputTextDatasBean.setTextData(inputTextDatasEntity.getTextData());
			listInputTextDatasBean.add(inputTextDatasBean);
		});
		
		return listInputTextDatasBean;
	}

}
