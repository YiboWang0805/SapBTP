package com.sapTest.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

public class Varsconfig {

    private String DOMIANNAME;

    public String getDOMIANNAME() {
        return DOMIANNAME;
    }

    public void setDOMIANNAME(String DOMIANNAME) {
        this.DOMIANNAME = DOMIANNAME;
    }
}
