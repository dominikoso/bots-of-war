package me.dominikoso.bow.model;

public class GameState {
    private Integer currentStep;
    private Integer currentTurn;
    private Integer gameId;
    private Action[] lastActions;
    private String[] lastLogs;
    private String mapPath;
    private Mine[] mines;
    private Player player1;
    private Player player2;
    private Integer tournamentId;

    //region Getters and Setters

    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }

    public Integer getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(Integer currentTurn) {
        this.currentTurn = currentTurn;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Action[] getLastActions() {
        return lastActions;
    }

    public void setLastActions(Action[] lastActions) {
        this.lastActions = lastActions;
    }

    public String[] getLastLogs() {
        return lastLogs;
    }

    public void setLastLogs(String[] lastLogs) {
        this.lastLogs = lastLogs;
    }

    public String getMapPath() {
        return mapPath;
    }

    public void setMapPath(String mapPath) {
        this.mapPath = mapPath;
    }

    public Mine[] getMines() {
        return mines;
    }

    public void setMines(Mine[] mines) {
        this.mines = mines;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    //endregion
}
