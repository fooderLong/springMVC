package com.test.service.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.VendorContract;
import com.test.mapper.VendorContractMapper;
import com.test.service.TestTableService;

@Service
public class TestTableServiceIml implements TestTableService {

	@Autowired
	private VendorContractMapper mapper;
	public VendorContract selectByPrimaryKey(Long contractId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(contractId);
	}

}
