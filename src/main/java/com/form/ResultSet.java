package com.form;

/**
 * Created by fujiwara_shuhei_gn on 2017/04/13.
 */
public class ResultSet {
    private int results_returned;
    private Event[] events;
    private int results_start;
    private int results_available;

    public int getResults_returned() {
        return results_returned;
    }

    public void setResults_returned(int results_returned) {
        this.results_returned = results_returned;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }

    public int getResults_start() {
        return results_start;
    }

    public void setResults_start(int results_start) {
        this.results_start = results_start;
    }

    public int getResults_available() {
        return results_available;
    }

    public void setResults_available(int results_available) {
        this.results_available = results_available;
    }
}
