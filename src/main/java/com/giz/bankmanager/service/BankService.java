package com.giz.bankmanager.service;

import com.giz.bankmanager.domain.Bank;
import com.giz.bankmanager.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    @Autowired
    public BankRepository bankRepository;

    public Bank saveBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank updateBank(long bankId, Bank bank) {
        Bank existingBank = bankRepository.getById(bankId);
        if (existingBank != null){
            existingBank.setName(bank.getName());
            existingBank.setCode(bank.getCode());
            existingBank.setStatus(bank.getStatus());
            existingBank.setNoOfBranches(bank.getNoOfBranches());
        }
        return bankRepository.save(existingBank);
    }

    public Optional<Bank> getBankById(long bankId) {
        return bankRepository.findById(bankId);
    }

    public void deleteBank(long bankId) {
        bankRepository.deleteById(bankId);
    }
}
