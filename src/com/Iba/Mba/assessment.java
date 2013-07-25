package com.Iba.Mba;

public class assessment {
	public assessment(String a, String d, String r) {
		// TODO Auto-generated constructor stub
		assessments = a;
		duedate = d;
		remarks = r;
	}

	String assessments;
	String duedate;
	String remarks;

	public String getAssessments() {
		return assessments;
	}

	public void setAssessments(String assessments) {
		this.assessments = assessments;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
