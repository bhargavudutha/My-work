package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Answer {
	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", answer_name=" + answer_name + ", postedBy=" + postedBy + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answer_id;
	private String answer_name;
	private String postedBy;

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer_name() {
		return answer_name;
	}

	public void setAnswer_name(String answer_name) {
		this.answer_name = answer_name;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
