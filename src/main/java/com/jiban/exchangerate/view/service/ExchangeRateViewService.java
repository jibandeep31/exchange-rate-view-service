package com.jiban.exchangerate.view.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jiban.exchangerate.view.dto.ExchangeRate;
import com.jiban.exchangerate.view.feign.ExchangeRateViewClient;

@Service
@Transactional
public class ExchangeRateViewService {

    private ExchangeRateViewClient exchangeRateViewClient;

    public ExchangeRate getExchangeRate(String fromCurrency) {
        return exchangeRateViewClient.getExchangeRate(fromCurrency);
    }

}
