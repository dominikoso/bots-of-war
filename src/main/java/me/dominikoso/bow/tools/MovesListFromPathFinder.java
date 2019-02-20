package me.dominikoso.bow.tools;

import org.newdawn.slick.util.pathfinding.Path;

import java.util.ArrayList;
import java.util.List;

public class MovesListFromPathFinder {
    //region getMovesListFromPath
    public static List<String> getMovesListFromPath(Path path) {
        ArrayList<String> moves = new ArrayList<>();
        for (int i = 0; i < path.getLength(); i++) {
            if (i != 0) {
                if (path.getStep(i).getX() > path.getStep(i-1).getX()){
                    moves.add("R");
                }else if (path.getStep(i).getX() < path.getStep(i-1).getX()){
                    moves.add("L");
                }else if (path.getStep(i).getY() < path.getStep(i-1).getY()){
                    moves.add("D");
                }else if (path.getStep(i).getY() > path.getStep(i-1).getY()){
                    moves.add("U");
                }
            }
        }
        return moves;
    }
    //endregion
}
