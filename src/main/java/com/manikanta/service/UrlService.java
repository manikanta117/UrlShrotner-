package com.manikanta.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikanta.model.UrlMapping;
import com.manikanta.repository.UrlRepository;

@Service
public class UrlService {

    
	@Autowired
	private UrlRepository urlRepository;


	
	public UrlMapping shortenUrl(String originalUrl) {
		String shortenCode = UUID.randomUUID()
				             .toString()
				             .substring(0,6);	
		UrlMapping urlMapping = new UrlMapping();
		
		urlMapping.setOriginalUrl(originalUrl.replace("\"", ""));
		urlMapping.setShortCode(shortenCode);
		
		return urlRepository.save(urlMapping);
	}
	public UrlMapping getOriginalUrl(String shortCode) {
		return urlRepository.findByShortCode(shortCode)
				.orElseThrow(()-> new RuntimeException("shorten Url Nt found"));
	}
		
}
