package com.jiban.exchangerate.view.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate {

    private String fromCurrency;

    private String toCurrString;

    private double exrate;
    
}
