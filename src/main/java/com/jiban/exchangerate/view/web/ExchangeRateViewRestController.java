package com.jiban.exchangerate.view.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jiban.exchangerate.view.service.ExchangeRateViewService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ExchangeRateViewRestController {

    private final ExchangeRateViewService exchangeRateViewService;

    public ExchangeRateViewRestController(final ExchangeRateViewService exchangeRateViewService) {
        this.exchangeRateViewService = exchangeRateViewService;
    }

    @GetMapping("/exchangerateview/fromCurrency/{fromCurrency}")
    public com.jiban.exchangerate.view.dto.ExchangeRate getExchangeRate(
            @PathVariable("fromCurrency") final String fromCurrency) {
        return exchangeRateViewService.getExchangeRate(fromCurrency);
    }

}
