package com.Iba.Mba;

public class tableData {
	public int id;
	public String text;

	public tableData(int i, String s) {
		id = i;
		text = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
