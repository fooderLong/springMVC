package com.test.dao;

import com.test.bean.VendorContract;
import com.test.bean.VendorContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VendorContractMapper {

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int countByExample(VendorContractExample example);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int deleteByExample(VendorContractExample example);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long contractId);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int insert(VendorContract record);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int insertSelective(VendorContract record);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	List<VendorContract> selectByExample(VendorContractExample example);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	VendorContract selectByPrimaryKey(Long contractId);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") VendorContract record,
			@Param("example") VendorContractExample example);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") VendorContract record, @Param("example") VendorContractExample example);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(VendorContract record);

	/**
	 * This method corresponds to the database table vendor_contract
	 * @mbggenerated
	 */
	int updateByPrimaryKey(VendorContract record);
}