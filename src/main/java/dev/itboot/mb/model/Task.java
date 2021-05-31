package dev.itboot.mb.model;

import java.util.Date;
import lombok.Data;

@Data
public class Task {

	public Task(String title, Date lmt) {
		this.title = title;
		this.lmt = lmt;
	}

	public Task(int id) {
		this.id = id;
	}

	public Task(int id, Boolean status, String title, Date lmt) {
		this.id = 0;
		this.status = status;
		this.title = title;
		this.lmt = lmt;
	}

	private int id;
	private boolean status;
	private String title;
	private Date lmt;

}
