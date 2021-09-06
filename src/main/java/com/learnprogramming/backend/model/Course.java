package com.learnprogramming.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="CourseName")
	private String coursName;
	
	@Column(name="Provider")
	private String provider;
	
	@Column(name="UniversitiesInstitutions")
	private String universitiesInstitutions;

	@Column(name="ParentSubject")
	private String parentSubject;

	@Column(name="ChildSubject")
	private String childSubject;
	
	@Column(name="Url")
	private String url;
	
	@Column(name="NextSessionDate")
	private String nextSessionDate;
	
	@Column(name="Length")
	private String length;
	
	@Column(name="VideoUrl")
	private String videoUrl;
	
	@Column(name="Image")
	private String imageUrl;
	
	public Course() {
		
	}
	public Course(long id, String coursName, String provider, String universitiesInstitutions, String parentSubject,
			String childSubject, String url, String nextSessionDate, String length, String videoUrl, String imageUrl) {
		super();
		this.id = id;
		this.coursName = coursName;
		this.provider = provider;
		this.universitiesInstitutions = universitiesInstitutions;
		this.parentSubject = parentSubject;
		this.childSubject = childSubject;
		this.url = url;
		this.nextSessionDate = nextSessionDate;
		this.length = length;
		this.videoUrl = videoUrl;
		this.imageUrl = imageUrl;
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCoursName() {
		return coursName;
	}
	
	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public String getUniversitiesInstitutions() {
		return universitiesInstitutions;
	}
	
	public void setUniversitiesInstitutions(String universitiesInstitutions) {
		this.universitiesInstitutions = universitiesInstitutions;
	}
	
	public String getParentSubject() {
		return parentSubject;
	}
	
	public void setParentSubject(String parentSubject) {
		this.parentSubject = parentSubject;
	}
	
	public String getChildSubject() {
		return childSubject;
	}
	
	public void setChildSubject(String childSubject) {
		this.childSubject = childSubject;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getNextSessionDate() {
		return nextSessionDate;
	}
	
	public void setNextSessionDate(String nextSessionDate) {
		this.nextSessionDate = nextSessionDate;
	}
	
	public String getLength() {
		return length;
	}
	
	public void setLength(String length) {
		this.length = length;
	}
	
	public String getVideoUrl() {
		return videoUrl;
	}
	
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
