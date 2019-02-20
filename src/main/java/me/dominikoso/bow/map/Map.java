package me.dominikoso.bow.map;

import org.newdawn.slick.util.pathfinding.Path;
import org.newdawn.slick.util.pathfinding.PathFindingContext;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import me.dominikoso.bow.map.TileEnum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public class Map implements TileBasedMap {

    public Integer[][] map;

    public Map(Integer[][] m){
        this.map = rotateMap(m);
    }

    Integer[][] rotateMap(Integer[][] map) {
        Integer[][] newMap = new Integer[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            newMap[i] = map[map.length - 1 - i];
        }
        return newMap;
    }

    public String getTileHTMLImageTag(int x, int y) {
        return "<img src=\"/images/" + getTileType(x, y).getFilename() + "\">";
    }

    //region TileTypeChooser
    private TileEnum getTileType(int x, int y) {
        Integer id = getTile(x, y);
        TileEnum tileType = TileEnum.DIRT;
        if (id == 0){
            tileType = TileEnum.DIRT;
        }else if (id == 1){
            tileType = TileEnum.GRASS;
        }else if (id == 2){
            tileType = TileEnum.WATER;
        }else if (id == 3){
            tileType = TileEnum.STONE;
        }else if (id == 4){
            tileType = TileEnum.BASE;
        }else if (id == 5){
            tileType = TileEnum.MINE;
        }
        return tileType;
    }
    //endregion

    public Integer getTile(int x, int y){
        return map[x][y];
    }

    public String toString() {
        String str = "\n";
        for(Integer[] row : map) {
            str += "[";
            for (Integer field : row) {
                str += String.valueOf(field);
            }
            str += "]\n";
        }
        return str;
    }

    public String toString(Path path) {
        String str = "\n";
        for(int y = 0; y < map.length; y++) {
            str += "[";
            for (int x = 0; x < map[y].length; x++) {
                str += path.contains(x,  map.length - y - 1) ? " " : String.valueOf(getTile(y, x));
            }
            str += "]\n";
        }
        return str;
    }

    public String toHTML() {
        String str = "";
        for(int y = 0; y < map.length; y++) {
            str += "<div class=\"row\">";
            for (int x = 0; x < map[0].length; x++) {
                str += getTileHTMLImageTag(x, y);
            }
            str += "</div>";
        }
        return str;
    }

    @Override
    public int getWidthInTiles() {
        return map[0].length;
    }

    @Override
    public int getHeightInTiles() {
        return map.length;
    }

    @Override
    public void pathFinderVisited(int x, int y) {}

    @Override
    public boolean blocked(PathFindingContext context, int tx, int ty) {
        Integer block = getTile(tx, ty);
        return !(block == 0 || block == 1);
    }

    @Override
    public float getCost(PathFindingContext context, int tx, int ty) {
        return 0;
    }
}