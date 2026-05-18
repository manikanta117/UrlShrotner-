package com.manikanta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikanta.model.UrlMapping;

public interface UrlRepository extends JpaRepository<UrlMapping, Long> {
		Optional<UrlMapping> findByShortCode(String shortcode);
}
