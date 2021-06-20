package com.covidmonitoriot.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateTimeSpringConverter implements Converter<String, LocalDateTime> {

    @Override
    public LocalDateTime convert(String value) {
        if(value != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            return LocalDateTime.parse(value, formatter);
        }else {
            return null;
        }
    }

}
