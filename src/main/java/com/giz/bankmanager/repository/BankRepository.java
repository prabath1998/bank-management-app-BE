package com.giz.bankmanager.repository;

import com.giz.bankmanager.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}
