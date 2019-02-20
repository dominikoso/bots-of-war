package me.dominikoso.bow.controller;

import me.dominikoso.bow.map.Map;
import me.dominikoso.bow.tools.DataFromApiFetchManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/map")
public class MapController {

    @GetMapping("/human")
    public static String getMapVisualization(Model model){
        DataFromApiFetchManager api = new DataFromApiFetchManager();
        Map map = new Map(api.getMap());
        String name = "";
        for(int y = 0; y < map.getWidthInTiles(); y++) {
            name += "<div class=\"row\">";
            for (int x = 0; x < map.getHeightInTiles(); x++) {
                name += (map.getTileHTMLImageTag(x, y));
            }
            name += "</div>";
        }
        model.addAttribute("n", name);
        return "map";
    }
}
