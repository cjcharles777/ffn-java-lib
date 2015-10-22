package com.donkeigy.ffn.bo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by cedric on 10/20/15.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class FFNNFLTeams
{
    private List<Team> NFLTeams;

    public List<Team> getNFLTeams() {
        return NFLTeams;
    }

    public void setNFLTeams(List<Team> NFLTeams) {
        this.NFLTeams = NFLTeams;
    }

    public FFNNFLTeams(List<Team> NFLTeams) {
        this.NFLTeams = NFLTeams;
    }

    public FFNNFLTeams() {

    }
}

