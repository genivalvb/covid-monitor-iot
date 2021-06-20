package com.covidmonitoriot.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateSpringConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String value) {
        System.err.println("Convertendo...");
        if(value != null) {
            System.err.println("Convertendo..." + value);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(value, formatter);
        }else {
            return null;
        }
    }

}