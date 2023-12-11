package com.example.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.app.bean.InputTextDatasBean;
import com.example.demo.domain.service.GetInputTextDatasService;


@Controller
public class TransferController {
	
	@Autowired
	GetInputTextDatasService getInputTextDatasService;
		
	
	@GetMapping("/from")
    public String getFrom(ModelMap modelMap) {
		return "view/from";
	}
	
	@GetMapping("/to")
    public String geTom(ModelMap modelMap) {
		List<InputTextDatasBean> listInputTextDatasBean = getInputTextDatasService.getAllDatas();
		modelMap.addAttribute("listInputTextDatasBean", listInputTextDatasBean);
		return "view/to";
	}
}
