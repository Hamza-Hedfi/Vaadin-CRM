package com.deuterium.tutorial.crm.backend.repository;

import com.deuterium.tutorial.crm.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
