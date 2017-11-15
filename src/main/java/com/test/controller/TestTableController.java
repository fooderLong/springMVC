package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.bean.VendorContract;
import com.test.service.TestTableService;

@Controller
@RequestMapping("/testTable")
public class TestTableController {

	@Autowired
	private TestTableService service;
	@RequestMapping("/search.do")
	public String getTable(Model model){
		Long key = (long) 119;
		List<VendorContract> list = service.selectByPrimaryKey(key);
		model.addAttribute("vo", list);
		return "testtable";
		
	}
}
