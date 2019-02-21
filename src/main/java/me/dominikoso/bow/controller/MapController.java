package me.dominikoso.bow.controller;

import me.dominikoso.bow.model.Entity;
import me.dominikoso.bow.model.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import org.newdawn.slick.util.pathfinding.AStarPathFinder;
import org.newdawn.slick.util.pathfinding.Path;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;

@Controller
@RequestMapping("/map")
public class MapController {
    //region getMapVisualizationWithPath
    @GetMapping("/path")
    public static String getMapVisualizationWithPath(
            @RequestParam(name="fromX", required=true) int fromX,
            @RequestParam(name="fromY", required=true) int fromY,
            @RequestParam(name="toX", required=true) int toX,
            @RequestParam(name="toY", required=true) int toY,
            Model model
    ){
        DataFromApiFetchManager api = new DataFromApiFetchManager();
        Map map = new Map(api.getMap());
        ArrayList<String> rows = new ArrayList<>();
        AStarPathFinder pathFinder = new AStarPathFinder(map, 1000, false);
        Path path = pathFinder.findPath(null, fromX, fromY, toX, toY);
        for(int y = 0; y < map.getHeightInTiles(); y++) {
            String name = "<div class=\"row\">";
            for (int x = 0; x < map.getWidthInTiles(); x++) {
                name += path.contains(x, y) ? "<img src=\"/images/path.png\">" :  (map.getTileHTMLImageTag(x, y));
            }
            name += "</div>";
            rows.add(name);
        }
        Collections.reverse(rows);
        model.addAttribute("n", String.join("\n", rows));
        return "map";
    }
    //endregion
    //region getMapVisualization
    @GetMapping("/show")
    public static String getMapVisualization(Model model){
        DataFromApiFetchManager api = new DataFromApiFetchManager();
        Map map = new Map(api.getMap());
        //region EntityPlacer
        for (Entity entity : api.getUnitList()) {
            Integer tileId = 6;
            String name = entity.getName();
            if (name == "WORKER"){
                tileId = 7;
            }else if(name == "WARRIOR"){
                tileId = 8;
            }else if(name == "ARCHER"){
                tileId = 9;
            }
            map.map[entity.getCoordinates()[0]][entity.getCoordinates()[1]] = tileId;
        }
        //endregion
        ArrayList<String> rows = new ArrayList<>();
        for(int y = 0; y < map.getHeightInTiles(); y++) {
            String name = "<div class=\"row\">";
            for (int x = 0; x < map.getWidthInTiles(); x++) {
                name += (map.getTileHTMLImageTag(x, y));
            }
            name += "</div>";
            rows.add(name);
        }
        Collections.reverse(rows);
        model.addAttribute("n", String.join("\n", rows));
        return "map";
    }
    //endregion
}
