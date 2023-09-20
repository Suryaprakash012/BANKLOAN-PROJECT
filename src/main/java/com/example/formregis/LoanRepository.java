package com.example.formregis;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loanapply, Long> {
	Loanapply findByUsername(String username);
}

