package com.giz.bankmanager.controller;

import com.giz.bankmanager.domain.Bank;
import com.giz.bankmanager.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/banks")
public class BankController {

    @Autowired
    public BankService bankService;

    @PostMapping
    public Bank saveBank(@RequestBody Bank bank){
        return bankService.saveBank(bank);
    }

    @GetMapping
    public List<Bank> getAllBanks(){
        return bankService.getAllBanks();
    }

    @PutMapping(path = "/{bankId}")
    public Bank updateBank(@PathVariable long bankId,@RequestBody Bank bank){
        return bankService.updateBank(bankId,bank);
    }

    @GetMapping(path = "/{bankId}")
    public Optional<Bank> getBankById(@PathVariable long bankId){
        return bankService.getBankById(bankId);
    }

    @DeleteMapping(path = "/{bankId}")
    public void deleteBank(@PathVariable long bankId){
        bankService.deleteBank(bankId);
    }

}
