package com.longdollar.long_dollar_app.repository;

import com.longdollar.long_dollar_app.model.Colleague;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA will automatically implement basic CRUD operations
public interface ColleagueRepository extends JpaRepository<Colleague, Integer> {

}