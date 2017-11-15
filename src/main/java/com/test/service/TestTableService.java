package com.test.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.test.bean.VendorContract;

@Component
public interface TestTableService {
	public List<VendorContract> selectByPrimaryKey(Long contractId);
}
