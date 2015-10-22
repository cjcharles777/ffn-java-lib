package com.donkeigy.ffn.bo;

/**
 * Created by cedric on 10/22/15.
 */
public class ScheduledGames
{
    private String gameId;
    private String gameWeek;
    private String gameDate;
    private String awayTeam;
    private String homeTeam;
    private String gameTimeET;
    private String tvStation;
    private String winner;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameWeek() {
        return gameWeek;
    }

    public void setGameWeek(String gameWeek) {
        this.gameWeek = gameWeek;
    }

    public String getGameDate() {
        return gameDate;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getGameTimeET() {
        return gameTimeET;
    }

    public void setGameTimeET(String gameTimeET) {
        this.gameTimeET = gameTimeET;
    }

    public String getTvStation() {
        return tvStation;
    }

    public void setTvStation(String tvStation) {
        this.tvStation = tvStation;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
