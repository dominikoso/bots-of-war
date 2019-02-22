package me.dominikoso.bow;

import me.dominikoso.bow.model.Entity;
import me.dominikoso.bow.model.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import me.dominikoso.bow.tools.MovesListFromPathFinder;
import org.newdawn.slick.util.pathfinding.AStarPathFinder;
import org.newdawn.slick.util.pathfinding.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BowApplication {

	static final Logger log = LoggerFactory.getLogger(BowApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BowApplication.class, args);

		DataFromApiFetchManager api = new DataFromApiFetchManager();

		Integer[][] rawMap = api.getMap();

		//region print map / map with path
		Map map = new Map(rawMap);
		log.info(map.toString());
		AStarPathFinder pathFinder = new AStarPathFinder(map, 1000, false);
		Path path = pathFinder.findPath(null,  0,  0,  6,  7);
		log.info(map.toString(path));
		log.info("Da Wae: " + MovesListFromPathFinder.getMovesListFromPath(path).toString());
		//endregion

        //region print map with coordinates from api
        map = new Map(rawMap);
        for (Integer[] cords : api.getCoordinatesList()) {
            map.map[cords[1]][cords[0]] = 6;
        }
		log.info(map.toString());
		//endregion

        //region print map with Entities from api
        map = new Map(rawMap);
        placeEntity(api, map);
        log.info(map.toString());
        //endregion
	}

    public static void placeEntity(DataFromApiFetchManager api, Map map) {
        for (Entity entity : api.getUnitList()) {
            Integer tileId = 6;
            String name = entity.getName();
            switch (name) {
                case "WORKER":
                    tileId = 7;
                    break;
                case "WARRIOR":
                    tileId = 8;
                    break;
                case "ARCHER":
                    tileId = 9;
                    break;
            }
            map.map[entity.getCoordinates().getY()][entity.getCoordinates().getX()] = tileId;
        }
    }

    @Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
