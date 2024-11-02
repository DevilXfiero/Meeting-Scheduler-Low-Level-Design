package org.example;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

//    private int id;
    private int capacity;
    private boolean isAvailable;
    private List<Interval> bookedIntervals;

    public MeetingRoom(int capacity, boolean isAvailable) {
        this.capacity = capacity;
        this.isAvailable = isAvailable;
        this.bookedIntervals = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Interval> getBookedIntervals() {
        return bookedIntervals;
    }

    public void setBookedIntervals(List<Interval> bookedIntervals) {
        this.bookedIntervals = bookedIntervals;
    }

    public void addBookedInterval(Interval interval) {
        this.bookedIntervals.add(interval);
    }
}
