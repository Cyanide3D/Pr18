package com.example.Pr18.service;

import com.example.Pr18.models.Bank;
import com.example.Pr18.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public void save(Bank bank) {
        bankRepository.save(bank);
    }

    public void delete(Long id) {
        bankRepository.delete(findBankById(id));
    }

    public Bank findBankById(Long id) {
        return bankRepository.findOneById(id);
    }

    public List<Bank> findBanksByName(String name) {
        return bankRepository.findAllByName(name);
    }

    public List<Bank> findBanksByAddress(String address) {
        return bankRepository.findAllByAddress(address);
    }

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

}
