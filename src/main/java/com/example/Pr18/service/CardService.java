package com.example.Pr18.service;

import com.example.Pr18.models.Card;
import com.example.Pr18.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public void save(Card card) {
        cardRepository.save(card);
    }

    public void delete(Long id) {
        cardRepository.delete(findCardById(id));
    }

    public Card findCardById(Long id) {
        return cardRepository.findOneById(id);
    }

    public List<Card> findCardsByCardNumber(int cardNumber) {
        return cardRepository.findAllByCardNumber(cardNumber);
    }

    public List<Card> findCardsByCode(int code) {
        return cardRepository.findAllByCode(code);
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

}
