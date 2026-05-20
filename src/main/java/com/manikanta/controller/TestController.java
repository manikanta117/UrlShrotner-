package com.manikanta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.manikanta.DTO.UrlReques;
import com.manikanta.model.UrlMapping;
import com.manikanta.service.UrlService;
@RestController
public class TestController {
		@Autowired
		private UrlService urlService;
	    
		@PostMapping("/shorten")
	    public UrlMapping shortenUrl(@RequestBody UrlReques request) {
	    	return urlService.shortenUrl(request.getUrl());
	    	
	    }
		  @GetMapping("/{shortCode}")
		public RedirectView redirect(@PathVariable String shortCode) {
			UrlMapping urlMapping = urlService.getOriginalUrl(shortCode);
			
			RedirectView redirectView = new RedirectView();
			
			redirectView.setUrl(urlMapping.getOriginalUrl());
			return redirectView;
}
}
