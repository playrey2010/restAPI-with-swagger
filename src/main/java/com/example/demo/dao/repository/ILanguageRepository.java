package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageRepository  extends JpaRepository<Language, Long> {
}
