package me.dominikoso.bow.enums;

public enum TileEnum {
    DIRT    (0, "dirt.png"),
    GRASS   (1, "grass.png"),
    WATER   (2, "water.png"),
    STONE   (3, "stone.png"),
    BASE    (4, "base.png"),
    MINE    (5, "mine.png"),
    HORSE   (6, "horse.png"),
    WORKER  (7, "worker.png"),
    WARRIOR (8, "warrior.png"),
    ARCHER  (9, "archer.png");

    private final Integer id;
    private final String filename;

    TileEnum(Integer id, String filename){
        this.id = id;
        this.filename = filename;
    }

    public Integer getId() { return id; }
    public String getFilename() { return filename; }

}
