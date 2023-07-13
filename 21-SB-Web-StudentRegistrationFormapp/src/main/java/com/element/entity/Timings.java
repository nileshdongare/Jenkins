package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Timings {
	@Id
	private Integer timingId;
	private String timingName;
	
	public Integer getTimingId() {
		return timingId;
	}

	public void setTimingId(Integer timingId) {
		this.timingId = timingId;
	}

	public String getTimingName() {
		return timingName;
	}

	public void setTimingName(String timingName) {
		this.timingName = timingName;
	}

	

}
