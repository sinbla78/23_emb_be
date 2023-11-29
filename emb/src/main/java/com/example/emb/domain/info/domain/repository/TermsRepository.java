package com.example.emb.domain.info.domain.repository;

import com.example.emb.domain.info.domain.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TermsRepository extends JpaRepository<Terms, Long> {

    Terms findByTermId(Long id);

    List<Terms> findByNameAndBirthdate(String name, String birthdate);

    List<Terms> findByName(String name);

}
