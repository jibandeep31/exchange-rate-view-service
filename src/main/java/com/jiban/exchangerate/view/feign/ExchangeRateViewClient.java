package com.jiban.exchangerate.view.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jiban.exchangerate.view.dto.ExchangeRate;

@FeignClient(name = "Exchange Rate View Client", url = "${client.url}")
public interface ExchangeRateViewClient {
    
    @GetMapping("/exchangerateupdate/fromCurrency/{fromCurrency}")
    public ExchangeRate getExchangeRate(@PathVariable("fromCurrency") String fromCurrency);

}
