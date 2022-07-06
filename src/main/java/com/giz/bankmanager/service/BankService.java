package com.giz.bankmanager.service;

import com.giz.bankmanager.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    public BankRepository bankRepository;

}
