package com.manikanta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UrlMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String originalUrl;
	
	@Column(unique = true)
	private String shortCode;
	
	private Long clickCount = 0L;

	public UrlMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UrlMapping(Long id, String originalUrl, String shortCode, Long clickCount) {
		super();
		this.id = id;
		this.originalUrl = originalUrl;
		this.shortCode = shortCode;
		this.clickCount = clickCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public Long getClickCount() {
		return clickCount;
	}

	public void setClickCount(Long clickCount) {
		this.clickCount = clickCount;
	}

	@Override
	public String toString() {
		return "UrlMapping [id=" + id + ", originalUrl=" + originalUrl + ", shortCode=" + shortCode + ", clickCount="
				+ clickCount + "]";
	}

	
}
