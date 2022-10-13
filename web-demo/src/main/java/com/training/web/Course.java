package com.training.web;

public class Course {
	private String courseId;
	private String courseName;
	private String duration;
	private String coursefee;
	public Course(String courseId, String courseName, String duration, String coursefee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.coursefee = coursefee;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(String coursefee) {
		this.coursefee = coursefee;
	}
	@Override
	public String toString() {
		return "courseId= " + courseId + ", courseName= " + courseName + ", duration= " + duration + ", coursefee= "
				+ coursefee ;
	}
	

}
