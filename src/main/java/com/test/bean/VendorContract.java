package com.test.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VendorContract implements Serializable {

	/**
	 * 合同ID. Column: vendor_contract.CONTRACT_ID
	 * @mbggenerated
	 */
	private Long contractId;
	/**
	 * 合同编号. Column: vendor_contract.CONTRACT_NO
	 * @mbggenerated
	 */
	private String contractNo;
	/**
	 * 运作类型:TRAIL试运营，QY签约. Column: vendor_contract.OP_TYPE_CD
	 * @mbggenerated
	 */
	private String opTypeCd;
	/**
	 * 合同类型：QY签约；B常跑；C临时. Column: vendor_contract.CONTRACT_TYPE_CD
	 * @mbggenerated
	 */
	private String contractTypeCd;
	/**
	 * 合同状态：NEW新建、SBT待审核(提交审核)、REJECT已驳回、PASS审核通过、EFFECT已生效、STOP已终止、OVERDUE已到期. Column: vendor_contract.CONTRACT_STATE_CD
	 * @mbggenerated
	 */
	private String contractStateCd;
	/**
	 * 承运商ID. Column: vendor_contract.VENDOR_ID
	 * @mbggenerated
	 */
	private Integer vendorId;
	/**
	 * 承运商NAME. Column: vendor_contract.VENDOR_NAME
	 * @mbggenerated
	 */
	private String vendorName;
	/**
	 * BF=大车队 SF=小车队 I=个体 T=汽贸公司. Column: vendor_contract.VENDOR_TYPE_CD
	 * @mbggenerated
	 */
	private String vendorTypeCd;
	/**
	 * 合作线路. Column: vendor_contract.CONTRACT_ROUTE_ID
	 * @mbggenerated
	 */
	private Long contractRouteId;
	/**
	 * 合同日期开始. Column: vendor_contract.CONTRACT_START_DATE
	 * @mbggenerated
	 */
	private Date contractStartDate;
	/**
	 * 合同日期结束. Column: vendor_contract.CONTRACT_END_DATE
	 * @mbggenerated
	 */
	private Date contractEndDate;
	/**
	 * 车头数量. Column: vendor_contract.TK_NUM
	 * @mbggenerated
	 */
	private Integer tkNum;
	/**
	 * 挂箱数量. Column: vendor_contract.TR_NUM
	 * @mbggenerated
	 */
	private Integer trNum;
	/**
	 * 开发人. Column: vendor_contract.DEVELOPER
	 * @mbggenerated
	 */
	private String developer;
	/**
	 * 上报城市. Column: vendor_contract.REPORT_CT
	 * @mbggenerated
	 */
	private Integer reportCt;
	/**
	 * 是否有货物运输险:Y是，N否. Column: vendor_contract.INSUER_GOODS
	 * @mbggenerated
	 */
	private String insuerGoods;
	/**
	 * 合同备注. Column: vendor_contract.REMARK
	 * @mbggenerated
	 */
	private String remark;
	/**
	 * 开票电话. Column: vendor_contract.INVOICE_TEL
	 * @mbggenerated
	 */
	private String invoiceTel;
	/**
	 * 开户行(银行名称). Column: vendor_contract.BANK_NAME
	 * @mbggenerated
	 */
	private String bankName;
	/**
	 * 银行账号. Column: vendor_contract.BANK_CARD_NO
	 * @mbggenerated
	 */
	private String bankCardNo;
	/**
	 * 统一社会信用代码. Column: vendor_contract.SOCIAL_CREDIT_CODE
	 * @mbggenerated
	 */
	private String socialCreditCode;
	/**
	 * 收款人. Column: vendor_contract.PAYEE
	 * @mbggenerated
	 */
	private String payee;
	/**
	 * 签约主体ProfileId. Column: vendor_contract.SIGNING_PROFILE_ID
	 * @mbggenerated
	 */
	private Integer signingProfileId;
	/**
	 * 签约主体Name. Column: vendor_contract.SIGNING_ORG_NAME
	 * @mbggenerated
	 */
	private String signingOrgName;
	/**
	 * 合作模式:DB11兜价保圈，DB10兜价不保圈，DB00不兜价不保圈. Column: vendor_contract.COOPERATE_MODE_CD
	 * @mbggenerated
	 */
	private String cooperateModeCd;
	/**
	 * 实际运作时间开始. Column: vendor_contract.ACT_OP_DATE_START
	 * @mbggenerated
	 */
	private Date actOpDateStart;
	/**
	 * 实际运作时间结束. Column: vendor_contract.ACT_OP_DATE_END
	 * @mbggenerated
	 */
	private Date actOpDateEnd;
	/**
	 * 合同牌价. Column: vendor_contract.QUOTE_PAICE
	 * @mbggenerated
	 */
	private BigDecimal quotePaice;
	/**
	 * 成本价. Column: vendor_contract.COST_PRICE
	 * @mbggenerated
	 */
	private BigDecimal costPrice;
	/**
	 * 单程时效. Column: vendor_contract.DURATION
	 * @mbggenerated
	 */
	private BigDecimal duration;
	/**
	 * 兜底结束时间. Column: vendor_contract.ENSURE_TIME_END
	 * @mbggenerated
	 */
	private Date ensureTimeEnd;
	/**
	 * 保圈圈数. Column: vendor_contract.ENSURE_CIRCLE_NUM
	 * @mbggenerated
	 */
	private Integer ensureCircleNum;
	/**
	 * 单圈单车补偿金额. Column: vendor_contract.SINGLE_CIRCLE_COMPENSATE
	 * @mbggenerated
	 */
	private BigDecimal singleCircleCompensate;
	/**
	 * 乙方原因补偿金额. Column: vendor_contract.PARTYB_REASONS_COMPENSATE
	 * @mbggenerated
	 */
	private BigDecimal partybReasonsCompensate;
	/**
	 * 押金. Column: vendor_contract.DEPOSIT
	 * @mbggenerated
	 */
	private BigDecimal deposit;
	/**
	 * 押金是否收回:Y是，N否. Column: vendor_contract.DEPOSIT_TASK_BACK_CD
	 * @mbggenerated
	 */
	private String depositTaskBackCd;
	/**
	 * 红利保圈车数. Column: vendor_contract.DIVIDEND_CIRCLE_NUM
	 * @mbggenerated
	 */
	private Integer dividendCircleNum;
	/**
	 * 红利抽取率. Column: vendor_contract.DIVIDEND_RATE
	 * @mbggenerated
	 */
	private BigDecimal dividendRate;
	/**
	 * 结算周期:单位. Column: vendor_contract.PAYMENT_CYCLE
	 * @mbggenerated
	 */
	private String paymentCycle;
	/**
	 * 是否安装G7:Y是，N否. Column: vendor_contract.INSTALLED_G7_CD
	 * @mbggenerated
	 */
	private String installedG7Cd;
	/**
	 * 原动力会员. Column: vendor_contract.ORIGINAL_MEMBER
	 * @mbggenerated
	 */
	private String originalMember;
	/**
	 * 原运力运作时间开始. Column: vendor_contract.ORIGINAL_OP_DATE_START
	 * @mbggenerated
	 */
	private Date originalOpDateStart;
	/**
	 * 原运力运作时间结束. Column: vendor_contract.ORIGINAL_OP_DATE_END
	 * @mbggenerated
	 */
	private Date originalOpDateEnd;
	/**
	 * 合同上传的证件、文件. Column: vendor_contract.CONTRACT_FILES
	 * @mbggenerated
	 */
	private Object contractFiles;
	/**
	 * 会员类型:B企业，C个人. Column: vendor_contract.USER_TYPE_CD
	 * @mbggenerated
	 */
	private String userTypeCd;
	/**
	 * 司机姓名. Column: vendor_contract.DRIVER_NAME
	 * @mbggenerated
	 */
	private String driverName;
	/**
	 * 身份证号码. Column: vendor_contract.ID_NO
	 * @mbggenerated
	 */
	private String idNo;
	/**
	 * 车辆型号:L960,L1250,L1650. Column: vendor_contract.TRUCK_TYPE_CD
	 * @mbggenerated
	 */
	private String truckTypeCd;
	/**
	 * 单趟价格. Column: vendor_contract.SINGLE_PRICE
	 * @mbggenerated
	 */
	private BigDecimal singlePrice;
	/**
	 * 车辆年限. Column: vendor_contract.TRUCK_LIFE
	 * @mbggenerated
	 */
	private Integer truckLife;
	/**
	 * 车辆品牌. Column: vendor_contract.TRUCK_BRAND
	 * @mbggenerated
	 */
	private String truckBrand;
	/**
	 * 是否开票:Y是，N否. Column: vendor_contract.INVOICE_FLAG_CD
	 * @mbggenerated
	 */
	private String invoiceFlagCd;
	/**
	 * 开票税率. Column: vendor_contract.INVOICE_RATE
	 * @mbggenerated
	 */
	private BigDecimal invoiceRate;
	/**
	 * 是否安装优卡APP:Y是，N否. Column: vendor_contract.INSTALLED_UKAPP_CD
	 * @mbggenerated
	 */
	private String installedUkappCd;
	/**
	 * Column: vendor_contract.DELETED
	 * @mbggenerated
	 */
	private Byte deleted;
	/**
	 * Column: vendor_contract.CREATED_TIME
	 * @mbggenerated
	 */
	private Date createdTime;
	/**
	 * Column: vendor_contract.UPDATED_TIME
	 * @mbggenerated
	 */
	private Date updatedTime;
	/**
	 * Column: vendor_contract.CREATED_BY
	 * @mbggenerated
	 */
	private Integer createdBy;
	/**
	 * Column: vendor_contract.CREATED_BY_NAME
	 * @mbggenerated
	 */
	private String createdByName;
	/**
	 * Column: vendor_contract.UPDATED_BY
	 * @mbggenerated
	 */
	private Integer updatedBy;
	/**
	 * Column: vendor_contract.UPDATED_BY_NAME
	 * @mbggenerated
	 */
	private String updatedByName;
	/**
	 * Column: vendor_contract.VERSION
	 * @mbggenerated
	 */
	private Integer version;
	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return  the value of vendor_contract.CONTRACT_ID
	 * @mbggenerated
	 */
	public Long getContractId() {
		return contractId;
	}

	/**
	 * @param contractId  the value for vendor_contract.CONTRACT_ID
	 * @mbggenerated
	 */
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_NO
	 * @mbggenerated
	 */
	public String getContractNo() {
		return contractNo;
	}

	/**
	 * @param contractNo  the value for vendor_contract.CONTRACT_NO
	 * @mbggenerated
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	/**
	 * @return  the value of vendor_contract.OP_TYPE_CD
	 * @mbggenerated
	 */
	public String getOpTypeCd() {
		return opTypeCd;
	}

	/**
	 * @param opTypeCd  the value for vendor_contract.OP_TYPE_CD
	 * @mbggenerated
	 */
	public void setOpTypeCd(String opTypeCd) {
		this.opTypeCd = opTypeCd;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_TYPE_CD
	 * @mbggenerated
	 */
	public String getContractTypeCd() {
		return contractTypeCd;
	}

	/**
	 * @param contractTypeCd  the value for vendor_contract.CONTRACT_TYPE_CD
	 * @mbggenerated
	 */
	public void setContractTypeCd(String contractTypeCd) {
		this.contractTypeCd = contractTypeCd;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_STATE_CD
	 * @mbggenerated
	 */
	public String getContractStateCd() {
		return contractStateCd;
	}

	/**
	 * @param contractStateCd  the value for vendor_contract.CONTRACT_STATE_CD
	 * @mbggenerated
	 */
	public void setContractStateCd(String contractStateCd) {
		this.contractStateCd = contractStateCd;
	}

	/**
	 * @return  the value of vendor_contract.VENDOR_ID
	 * @mbggenerated
	 */
	public Integer getVendorId() {
		return vendorId;
	}

	/**
	 * @param vendorId  the value for vendor_contract.VENDOR_ID
	 * @mbggenerated
	 */
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @return  the value of vendor_contract.VENDOR_NAME
	 * @mbggenerated
	 */
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * @param vendorName  the value for vendor_contract.VENDOR_NAME
	 * @mbggenerated
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 * @return  the value of vendor_contract.VENDOR_TYPE_CD
	 * @mbggenerated
	 */
	public String getVendorTypeCd() {
		return vendorTypeCd;
	}

	/**
	 * @param vendorTypeCd  the value for vendor_contract.VENDOR_TYPE_CD
	 * @mbggenerated
	 */
	public void setVendorTypeCd(String vendorTypeCd) {
		this.vendorTypeCd = vendorTypeCd;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_ROUTE_ID
	 * @mbggenerated
	 */
	public Long getContractRouteId() {
		return contractRouteId;
	}

	/**
	 * @param contractRouteId  the value for vendor_contract.CONTRACT_ROUTE_ID
	 * @mbggenerated
	 */
	public void setContractRouteId(Long contractRouteId) {
		this.contractRouteId = contractRouteId;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_START_DATE
	 * @mbggenerated
	 */
	public Date getContractStartDate() {
		return contractStartDate;
	}

	/**
	 * @param contractStartDate  the value for vendor_contract.CONTRACT_START_DATE
	 * @mbggenerated
	 */
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_END_DATE
	 * @mbggenerated
	 */
	public Date getContractEndDate() {
		return contractEndDate;
	}

	/**
	 * @param contractEndDate  the value for vendor_contract.CONTRACT_END_DATE
	 * @mbggenerated
	 */
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	/**
	 * @return  the value of vendor_contract.TK_NUM
	 * @mbggenerated
	 */
	public Integer getTkNum() {
		return tkNum;
	}

	/**
	 * @param tkNum  the value for vendor_contract.TK_NUM
	 * @mbggenerated
	 */
	public void setTkNum(Integer tkNum) {
		this.tkNum = tkNum;
	}

	/**
	 * @return  the value of vendor_contract.TR_NUM
	 * @mbggenerated
	 */
	public Integer getTrNum() {
		return trNum;
	}

	/**
	 * @param trNum  the value for vendor_contract.TR_NUM
	 * @mbggenerated
	 */
	public void setTrNum(Integer trNum) {
		this.trNum = trNum;
	}

	/**
	 * @return  the value of vendor_contract.DEVELOPER
	 * @mbggenerated
	 */
	public String getDeveloper() {
		return developer;
	}

	/**
	 * @param developer  the value for vendor_contract.DEVELOPER
	 * @mbggenerated
	 */
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	/**
	 * @return  the value of vendor_contract.REPORT_CT
	 * @mbggenerated
	 */
	public Integer getReportCt() {
		return reportCt;
	}

	/**
	 * @param reportCt  the value for vendor_contract.REPORT_CT
	 * @mbggenerated
	 */
	public void setReportCt(Integer reportCt) {
		this.reportCt = reportCt;
	}

	/**
	 * @return  the value of vendor_contract.INSUER_GOODS
	 * @mbggenerated
	 */
	public String getInsuerGoods() {
		return insuerGoods;
	}

	/**
	 * @param insuerGoods  the value for vendor_contract.INSUER_GOODS
	 * @mbggenerated
	 */
	public void setInsuerGoods(String insuerGoods) {
		this.insuerGoods = insuerGoods;
	}

	/**
	 * @return  the value of vendor_contract.REMARK
	 * @mbggenerated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark  the value for vendor_contract.REMARK
	 * @mbggenerated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return  the value of vendor_contract.INVOICE_TEL
	 * @mbggenerated
	 */
	public String getInvoiceTel() {
		return invoiceTel;
	}

	/**
	 * @param invoiceTel  the value for vendor_contract.INVOICE_TEL
	 * @mbggenerated
	 */
	public void setInvoiceTel(String invoiceTel) {
		this.invoiceTel = invoiceTel;
	}

	/**
	 * @return  the value of vendor_contract.BANK_NAME
	 * @mbggenerated
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName  the value for vendor_contract.BANK_NAME
	 * @mbggenerated
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return  the value of vendor_contract.BANK_CARD_NO
	 * @mbggenerated
	 */
	public String getBankCardNo() {
		return bankCardNo;
	}

	/**
	 * @param bankCardNo  the value for vendor_contract.BANK_CARD_NO
	 * @mbggenerated
	 */
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	/**
	 * @return  the value of vendor_contract.SOCIAL_CREDIT_CODE
	 * @mbggenerated
	 */
	public String getSocialCreditCode() {
		return socialCreditCode;
	}

	/**
	 * @param socialCreditCode  the value for vendor_contract.SOCIAL_CREDIT_CODE
	 * @mbggenerated
	 */
	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

	/**
	 * @return  the value of vendor_contract.PAYEE
	 * @mbggenerated
	 */
	public String getPayee() {
		return payee;
	}

	/**
	 * @param payee  the value for vendor_contract.PAYEE
	 * @mbggenerated
	 */
	public void setPayee(String payee) {
		this.payee = payee;
	}

	/**
	 * @return  the value of vendor_contract.SIGNING_PROFILE_ID
	 * @mbggenerated
	 */
	public Integer getSigningProfileId() {
		return signingProfileId;
	}

	/**
	 * @param signingProfileId  the value for vendor_contract.SIGNING_PROFILE_ID
	 * @mbggenerated
	 */
	public void setSigningProfileId(Integer signingProfileId) {
		this.signingProfileId = signingProfileId;
	}

	/**
	 * @return  the value of vendor_contract.SIGNING_ORG_NAME
	 * @mbggenerated
	 */
	public String getSigningOrgName() {
		return signingOrgName;
	}

	/**
	 * @param signingOrgName  the value for vendor_contract.SIGNING_ORG_NAME
	 * @mbggenerated
	 */
	public void setSigningOrgName(String signingOrgName) {
		this.signingOrgName = signingOrgName;
	}

	/**
	 * @return  the value of vendor_contract.COOPERATE_MODE_CD
	 * @mbggenerated
	 */
	public String getCooperateModeCd() {
		return cooperateModeCd;
	}

	/**
	 * @param cooperateModeCd  the value for vendor_contract.COOPERATE_MODE_CD
	 * @mbggenerated
	 */
	public void setCooperateModeCd(String cooperateModeCd) {
		this.cooperateModeCd = cooperateModeCd;
	}

	/**
	 * @return  the value of vendor_contract.ACT_OP_DATE_START
	 * @mbggenerated
	 */
	public Date getActOpDateStart() {
		return actOpDateStart;
	}

	/**
	 * @param actOpDateStart  the value for vendor_contract.ACT_OP_DATE_START
	 * @mbggenerated
	 */
	public void setActOpDateStart(Date actOpDateStart) {
		this.actOpDateStart = actOpDateStart;
	}

	/**
	 * @return  the value of vendor_contract.ACT_OP_DATE_END
	 * @mbggenerated
	 */
	public Date getActOpDateEnd() {
		return actOpDateEnd;
	}

	/**
	 * @param actOpDateEnd  the value for vendor_contract.ACT_OP_DATE_END
	 * @mbggenerated
	 */
	public void setActOpDateEnd(Date actOpDateEnd) {
		this.actOpDateEnd = actOpDateEnd;
	}

	/**
	 * @return  the value of vendor_contract.QUOTE_PAICE
	 * @mbggenerated
	 */
	public BigDecimal getQuotePaice() {
		return quotePaice;
	}

	/**
	 * @param quotePaice  the value for vendor_contract.QUOTE_PAICE
	 * @mbggenerated
	 */
	public void setQuotePaice(BigDecimal quotePaice) {
		this.quotePaice = quotePaice;
	}

	/**
	 * @return  the value of vendor_contract.COST_PRICE
	 * @mbggenerated
	 */
	public BigDecimal getCostPrice() {
		return costPrice;
	}

	/**
	 * @param costPrice  the value for vendor_contract.COST_PRICE
	 * @mbggenerated
	 */
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	/**
	 * @return  the value of vendor_contract.DURATION
	 * @mbggenerated
	 */
	public BigDecimal getDuration() {
		return duration;
	}

	/**
	 * @param duration  the value for vendor_contract.DURATION
	 * @mbggenerated
	 */
	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	/**
	 * @return  the value of vendor_contract.ENSURE_TIME_END
	 * @mbggenerated
	 */
	public Date getEnsureTimeEnd() {
		return ensureTimeEnd;
	}

	/**
	 * @param ensureTimeEnd  the value for vendor_contract.ENSURE_TIME_END
	 * @mbggenerated
	 */
	public void setEnsureTimeEnd(Date ensureTimeEnd) {
		this.ensureTimeEnd = ensureTimeEnd;
	}

	/**
	 * @return  the value of vendor_contract.ENSURE_CIRCLE_NUM
	 * @mbggenerated
	 */
	public Integer getEnsureCircleNum() {
		return ensureCircleNum;
	}

	/**
	 * @param ensureCircleNum  the value for vendor_contract.ENSURE_CIRCLE_NUM
	 * @mbggenerated
	 */
	public void setEnsureCircleNum(Integer ensureCircleNum) {
		this.ensureCircleNum = ensureCircleNum;
	}

	/**
	 * @return  the value of vendor_contract.SINGLE_CIRCLE_COMPENSATE
	 * @mbggenerated
	 */
	public BigDecimal getSingleCircleCompensate() {
		return singleCircleCompensate;
	}

	/**
	 * @param singleCircleCompensate  the value for vendor_contract.SINGLE_CIRCLE_COMPENSATE
	 * @mbggenerated
	 */
	public void setSingleCircleCompensate(BigDecimal singleCircleCompensate) {
		this.singleCircleCompensate = singleCircleCompensate;
	}

	/**
	 * @return  the value of vendor_contract.PARTYB_REASONS_COMPENSATE
	 * @mbggenerated
	 */
	public BigDecimal getPartybReasonsCompensate() {
		return partybReasonsCompensate;
	}

	/**
	 * @param partybReasonsCompensate  the value for vendor_contract.PARTYB_REASONS_COMPENSATE
	 * @mbggenerated
	 */
	public void setPartybReasonsCompensate(BigDecimal partybReasonsCompensate) {
		this.partybReasonsCompensate = partybReasonsCompensate;
	}

	/**
	 * @return  the value of vendor_contract.DEPOSIT
	 * @mbggenerated
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}

	/**
	 * @param deposit  the value for vendor_contract.DEPOSIT
	 * @mbggenerated
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	/**
	 * @return  the value of vendor_contract.DEPOSIT_TASK_BACK_CD
	 * @mbggenerated
	 */
	public String getDepositTaskBackCd() {
		return depositTaskBackCd;
	}

	/**
	 * @param depositTaskBackCd  the value for vendor_contract.DEPOSIT_TASK_BACK_CD
	 * @mbggenerated
	 */
	public void setDepositTaskBackCd(String depositTaskBackCd) {
		this.depositTaskBackCd = depositTaskBackCd;
	}

	/**
	 * @return  the value of vendor_contract.DIVIDEND_CIRCLE_NUM
	 * @mbggenerated
	 */
	public Integer getDividendCircleNum() {
		return dividendCircleNum;
	}

	/**
	 * @param dividendCircleNum  the value for vendor_contract.DIVIDEND_CIRCLE_NUM
	 * @mbggenerated
	 */
	public void setDividendCircleNum(Integer dividendCircleNum) {
		this.dividendCircleNum = dividendCircleNum;
	}

	/**
	 * @return  the value of vendor_contract.DIVIDEND_RATE
	 * @mbggenerated
	 */
	public BigDecimal getDividendRate() {
		return dividendRate;
	}

	/**
	 * @param dividendRate  the value for vendor_contract.DIVIDEND_RATE
	 * @mbggenerated
	 */
	public void setDividendRate(BigDecimal dividendRate) {
		this.dividendRate = dividendRate;
	}

	/**
	 * @return  the value of vendor_contract.PAYMENT_CYCLE
	 * @mbggenerated
	 */
	public String getPaymentCycle() {
		return paymentCycle;
	}

	/**
	 * @param paymentCycle  the value for vendor_contract.PAYMENT_CYCLE
	 * @mbggenerated
	 */
	public void setPaymentCycle(String paymentCycle) {
		this.paymentCycle = paymentCycle;
	}

	/**
	 * @return  the value of vendor_contract.INSTALLED_G7_CD
	 * @mbggenerated
	 */
	public String getInstalledG7Cd() {
		return installedG7Cd;
	}

	/**
	 * @param installedG7Cd  the value for vendor_contract.INSTALLED_G7_CD
	 * @mbggenerated
	 */
	public void setInstalledG7Cd(String installedG7Cd) {
		this.installedG7Cd = installedG7Cd;
	}

	/**
	 * @return  the value of vendor_contract.ORIGINAL_MEMBER
	 * @mbggenerated
	 */
	public String getOriginalMember() {
		return originalMember;
	}

	/**
	 * @param originalMember  the value for vendor_contract.ORIGINAL_MEMBER
	 * @mbggenerated
	 */
	public void setOriginalMember(String originalMember) {
		this.originalMember = originalMember;
	}

	/**
	 * @return  the value of vendor_contract.ORIGINAL_OP_DATE_START
	 * @mbggenerated
	 */
	public Date getOriginalOpDateStart() {
		return originalOpDateStart;
	}

	/**
	 * @param originalOpDateStart  the value for vendor_contract.ORIGINAL_OP_DATE_START
	 * @mbggenerated
	 */
	public void setOriginalOpDateStart(Date originalOpDateStart) {
		this.originalOpDateStart = originalOpDateStart;
	}

	/**
	 * @return  the value of vendor_contract.ORIGINAL_OP_DATE_END
	 * @mbggenerated
	 */
	public Date getOriginalOpDateEnd() {
		return originalOpDateEnd;
	}

	/**
	 * @param originalOpDateEnd  the value for vendor_contract.ORIGINAL_OP_DATE_END
	 * @mbggenerated
	 */
	public void setOriginalOpDateEnd(Date originalOpDateEnd) {
		this.originalOpDateEnd = originalOpDateEnd;
	}

	/**
	 * @return  the value of vendor_contract.CONTRACT_FILES
	 * @mbggenerated
	 */
	public Object getContractFiles() {
		return contractFiles;
	}

	/**
	 * @param contractFiles  the value for vendor_contract.CONTRACT_FILES
	 * @mbggenerated
	 */
	public void setContractFiles(Object contractFiles) {
		this.contractFiles = contractFiles;
	}

	/**
	 * @return  the value of vendor_contract.USER_TYPE_CD
	 * @mbggenerated
	 */
	public String getUserTypeCd() {
		return userTypeCd;
	}

	/**
	 * @param userTypeCd  the value for vendor_contract.USER_TYPE_CD
	 * @mbggenerated
	 */
	public void setUserTypeCd(String userTypeCd) {
		this.userTypeCd = userTypeCd;
	}

	/**
	 * @return  the value of vendor_contract.DRIVER_NAME
	 * @mbggenerated
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * @param driverName  the value for vendor_contract.DRIVER_NAME
	 * @mbggenerated
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * @return  the value of vendor_contract.ID_NO
	 * @mbggenerated
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @param idNo  the value for vendor_contract.ID_NO
	 * @mbggenerated
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @return  the value of vendor_contract.TRUCK_TYPE_CD
	 * @mbggenerated
	 */
	public String getTruckTypeCd() {
		return truckTypeCd;
	}

	/**
	 * @param truckTypeCd  the value for vendor_contract.TRUCK_TYPE_CD
	 * @mbggenerated
	 */
	public void setTruckTypeCd(String truckTypeCd) {
		this.truckTypeCd = truckTypeCd;
	}

	/**
	 * @return  the value of vendor_contract.SINGLE_PRICE
	 * @mbggenerated
	 */
	public BigDecimal getSinglePrice() {
		return singlePrice;
	}

	/**
	 * @param singlePrice  the value for vendor_contract.SINGLE_PRICE
	 * @mbggenerated
	 */
	public void setSinglePrice(BigDecimal singlePrice) {
		this.singlePrice = singlePrice;
	}

	/**
	 * @return  the value of vendor_contract.TRUCK_LIFE
	 * @mbggenerated
	 */
	public Integer getTruckLife() {
		return truckLife;
	}

	/**
	 * @param truckLife  the value for vendor_contract.TRUCK_LIFE
	 * @mbggenerated
	 */
	public void setTruckLife(Integer truckLife) {
		this.truckLife = truckLife;
	}

	/**
	 * @return  the value of vendor_contract.TRUCK_BRAND
	 * @mbggenerated
	 */
	public String getTruckBrand() {
		return truckBrand;
	}

	/**
	 * @param truckBrand  the value for vendor_contract.TRUCK_BRAND
	 * @mbggenerated
	 */
	public void setTruckBrand(String truckBrand) {
		this.truckBrand = truckBrand;
	}

	/**
	 * @return  the value of vendor_contract.INVOICE_FLAG_CD
	 * @mbggenerated
	 */
	public String getInvoiceFlagCd() {
		return invoiceFlagCd;
	}

	/**
	 * @param invoiceFlagCd  the value for vendor_contract.INVOICE_FLAG_CD
	 * @mbggenerated
	 */
	public void setInvoiceFlagCd(String invoiceFlagCd) {
		this.invoiceFlagCd = invoiceFlagCd;
	}

	/**
	 * @return  the value of vendor_contract.INVOICE_RATE
	 * @mbggenerated
	 */
	public BigDecimal getInvoiceRate() {
		return invoiceRate;
	}

	/**
	 * @param invoiceRate  the value for vendor_contract.INVOICE_RATE
	 * @mbggenerated
	 */
	public void setInvoiceRate(BigDecimal invoiceRate) {
		this.invoiceRate = invoiceRate;
	}

	/**
	 * @return  the value of vendor_contract.INSTALLED_UKAPP_CD
	 * @mbggenerated
	 */
	public String getInstalledUkappCd() {
		return installedUkappCd;
	}

	/**
	 * @param installedUkappCd  the value for vendor_contract.INSTALLED_UKAPP_CD
	 * @mbggenerated
	 */
	public void setInstalledUkappCd(String installedUkappCd) {
		this.installedUkappCd = installedUkappCd;
	}

	/**
	 * @return  the value of vendor_contract.DELETED
	 * @mbggenerated
	 */
	public Byte getDeleted() {
		return deleted;
	}

	/**
	 * @param deleted  the value for vendor_contract.DELETED
	 * @mbggenerated
	 */
	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	/**
	 * @return  the value of vendor_contract.CREATED_TIME
	 * @mbggenerated
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime  the value for vendor_contract.CREATED_TIME
	 * @mbggenerated
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return  the value of vendor_contract.UPDATED_TIME
	 * @mbggenerated
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * @param updatedTime  the value for vendor_contract.UPDATED_TIME
	 * @mbggenerated
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * @return  the value of vendor_contract.CREATED_BY
	 * @mbggenerated
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy  the value for vendor_contract.CREATED_BY
	 * @mbggenerated
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return  the value of vendor_contract.CREATED_BY_NAME
	 * @mbggenerated
	 */
	public String getCreatedByName() {
		return createdByName;
	}

	/**
	 * @param createdByName  the value for vendor_contract.CREATED_BY_NAME
	 * @mbggenerated
	 */
	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	/**
	 * @return  the value of vendor_contract.UPDATED_BY
	 * @mbggenerated
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy  the value for vendor_contract.UPDATED_BY
	 * @mbggenerated
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return  the value of vendor_contract.UPDATED_BY_NAME
	 * @mbggenerated
	 */
	public String getUpdatedByName() {
		return updatedByName;
	}

	/**
	 * @param updatedByName  the value for vendor_contract.UPDATED_BY_NAME
	 * @mbggenerated
	 */
	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	/**
	 * @return  the value of vendor_contract.VERSION
	 * @mbggenerated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version  the value for vendor_contract.VERSION
	 * @mbggenerated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}