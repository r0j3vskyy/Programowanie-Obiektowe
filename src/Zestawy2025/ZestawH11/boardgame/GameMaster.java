package Zestawy2025.ZestawH11.boardgame;

import java.util.Arrays;

public class GameMaster implements Cloneable {
    private String name;
    private double[] playerScores;

    public GameMaster(String name, double[] playerScores){
        this.name = name;
        this.playerScores = playerScores.clone();
    }
    public String getName() {
        return name;
    }
    public double[] getPlayerScores() {
        return playerScores;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayerScores(double[] playerScores) {
        this.playerScores = playerScores;
    }
    public void setScore(int index, double score){
        this.playerScores[index] = score;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +getName()+ ", " +Arrays.toString(playerScores);
    }

    @Override
    public GameMaster clone() throws CloneNotSupportedException {
        GameMaster cloned = (GameMaster) super.clone();
        cloned.playerScores = this.playerScores.clone();
        return cloned;
    }
}
