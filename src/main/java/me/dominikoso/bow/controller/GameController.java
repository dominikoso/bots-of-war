package me.dominikoso.bow.controller;

import me.dominikoso.bow.BowApplication;
import me.dominikoso.bow.model.Entity;
import me.dominikoso.bow.model.GameState;
import me.dominikoso.bow.model.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    static final Logger log = LoggerFactory.getLogger(BowApplication.class);

    @RequestMapping(value = "/bot", method = RequestMethod.POST)
    public static String createOrder(@RequestBody GameState gameState) {
        DataFromApiFetchManager api = new DataFromApiFetchManager();
        Map map = new Map(api.getMap());
        BowApplication.placeEntity(gameState.getPlayer1().getUnits(), map);
        BowApplication.placeEntity(gameState.getPlayer2().getUnits(), map);
        return map.toString();
    }

}
