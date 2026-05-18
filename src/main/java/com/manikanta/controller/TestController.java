package com.manikanta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manikanta.model.UrlMapping;
import com.manikanta.service.UrlService;
@RestController
public class TestController {
		@Autowired
		private UrlService urlService;
	    
		@PostMapping("/shorten")
	    public UrlMapping shortenUrl(@RequestBody String OriginalUrl) {
	    	return urlService.shortenUrl(OriginalUrl);
	    	
	    }
}
