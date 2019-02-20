package me.dominikoso.bow;

import me.dominikoso.bow.map.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import me.dominikoso.bow.tools.MovesListFromPathFinder;
import org.newdawn.slick.util.pathfinding.AStarPathFinder;
import org.newdawn.slick.util.pathfinding.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class BowApplication {

	static final Logger log = LoggerFactory.getLogger(BowApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BowApplication.class, args);

		DataFromApiFetchManager api = new DataFromApiFetchManager();

		Map map = new Map(api.getMap());
		log.info(map.toString());
		AStarPathFinder pathFinder = new AStarPathFinder(map, 1000, false);
		Path path = pathFinder.findPath(null,  0,  0,  6,  7);
		log.info(map.toString(path));
		log.info("Da Wae: " + MovesListFromPathFinder.getMovesListFromPath(path).toString());
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
