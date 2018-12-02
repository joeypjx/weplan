package org.weplan.model;

public class Plan {
	
	private String title;

	public Plan() {
		super();
	}

	public Plan(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Plan [title=" + title + "]";
	}
	
}