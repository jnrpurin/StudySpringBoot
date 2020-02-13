package com.example.demo.model;

import java.util.Optional;

public class SampleEg {
	private Optional<String> name;
	private long id;

	public Optional<String> getMessage() {
		return name;
	}

	public void setMessage(Optional<String> name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
