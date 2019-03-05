package me.dominikoso.bow.tools;

import me.dominikoso.bow.model.Entity;
import me.dominikoso.bow.model.GameSettings;
import org.newdawn.slick.Game;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class DataFromApiFetchManager {

    RestTemplate restTemplate = new RestTemplate();

    private String NCDC_URL = "http://bow.westeurope.cloudapp.azure.com:8080";

    public Integer[][] getMap() {
        return restTemplate.getForObject(NCDC_URL + "/getMap", Integer[][].class);
    }

    public Integer[][] getCoordinatesList() { return restTemplate.getForObject(NCDC_URL + "/getCoordinatesList", Integer[][].class); }

    public Entity[] getUnitList() { return restTemplate.getForObject(NCDC_URL + "/getUnitList", Entity[].class); }

    public GameSettings getGameSettings() { return restTemplate.getForObject(NCDC_URL + "/getGameSettings", GameSettings.class); }
}
