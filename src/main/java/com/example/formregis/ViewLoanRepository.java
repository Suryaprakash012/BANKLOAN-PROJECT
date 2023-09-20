package com.example.formregis;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewLoanRepository extends JpaRepository<Viewloan, Long> {
    // You can define custom query methods here if needed
}