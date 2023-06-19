package com.nestbuzhune.image.collection.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nestbuzhune.image.collection.system.model.Images;

public interface uploadRepository extends JpaRepository<Images, Integer> {

}
