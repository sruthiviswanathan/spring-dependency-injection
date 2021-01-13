package com.example.springdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello People - EN";
    }
}
