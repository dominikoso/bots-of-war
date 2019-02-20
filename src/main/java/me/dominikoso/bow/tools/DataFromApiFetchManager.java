package me.dominikoso.bow.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class DataFromApiFetchManager {

    RestTemplate restTemplate = new RestTemplate();

    private String NCDC_URL = "http://bow.westeurope.cloudapp.azure.com:8080";

    public Integer[][] getMap() {
        return restTemplate.getForObject(NCDC_URL + "/getMap", Integer[][].class);
    }

    public Integer[][] getCoordinatesList() {
        return restTemplate.getForObject(NCDC_URL + "/getCoordinatesList", Integer[][].class);
    }
}
