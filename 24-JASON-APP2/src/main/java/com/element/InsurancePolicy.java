package com.element;

public class InsurancePolicy {
	
	private String policyName;
	private String startDate;
	private String endDate;
	private Double premiumamt;
	@Override
	public String toString() {
		return "InsurancePolicy [policyName=" + policyName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", premiumamt=" + premiumamt + "]";
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getPremiumamt() {
		return premiumamt;
	}
	public void setPremiumamt(Double premiumamt) {
		this.premiumamt = premiumamt;
	}
	public InsurancePolicy(String policyName, String startDate, String endDate, Double premiumamt) {
		super();
		this.policyName = policyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.premiumamt = premiumamt;
	}
	
	

}
