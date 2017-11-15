package com.test.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.VendorContract;
import com.test.bean.VendorContractExample;
import com.test.dao.VendorContractMapper;
import com.test.service.TestTableService;

@Service
public class TestTableServiceIml implements TestTableService {

	@Autowired
	private VendorContractMapper mapper;
	public List<VendorContract> selectByPrimaryKey(Long contractId) {
		VendorContractExample exam = new VendorContractExample();
		exam.createCriteria().andActOpDateEndIsNull();
		return mapper.selectByExample(exam);
		
	}

}
