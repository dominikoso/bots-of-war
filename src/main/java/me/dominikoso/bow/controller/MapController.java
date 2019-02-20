package me.dominikoso.bow.controller;

import me.dominikoso.bow.map.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

@Controller
@RequestMapping("/map")
public class MapController {

    @GetMapping("/human")
    public static String getMapVisualization(Model model){
        DataFromApiFetchManager api = new DataFromApiFetchManager();
        Map map = new Map(api.getMap());
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
}
