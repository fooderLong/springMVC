package com.test.service;

import org.springframework.stereotype.Component;

import com.test.bean.VendorContract;

@Component
public interface TestTableService {
	public VendorContract selectByPrimaryKey(Long contractId);
}
