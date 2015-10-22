package com.donkeigy.ffn.bo;

import java.util.List;

/**
 * Created by cedric on 10/22/15.
 */
public class FFNSchedule {
    private String currentWeek;
    private List<ScheduledGames> Schedule;

    public String getCurrentWeek() {
        return currentWeek;
    }

    public void setCurrentWeek(String currentWeek) {
        this.currentWeek = currentWeek;
    }

    public List<ScheduledGames> getSchedule() {
        return Schedule;
    }

    public void setSchedule(List<ScheduledGames> schedule) {
        Schedule = schedule;
    }
}
