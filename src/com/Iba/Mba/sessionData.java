package com.Iba.Mba;

public class sessionData {
	String chapters;

	public String getChapters() {
		return chapters;
	}

	public void setChapters(String chapters) {
		this.chapters = chapters;
	}

	public String getSessionTopic() {
		return SessionTopic;
	}

	public void setSessionTopic(String sessionTopic) {
		SessionTopic = sessionTopic;
	}

	public String getAssessments() {
		return Assessments;
	}

	public void setAssessments(String assessments) {
		Assessments = assessments;
	}

	String SessionTopic;
	String Assessments;

	public sessionData(String c, String s, String a) {
		// TODO Auto-generated constructor stub
		chapters = c;
		SessionTopic = s;
		Assessments = a;
	}
}
