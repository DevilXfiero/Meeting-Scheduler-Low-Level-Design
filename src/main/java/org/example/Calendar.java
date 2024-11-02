package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Meeting> meetings;

    public Calendar() {
        this.meetings = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        this.meetings.add(meeting);
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }
}

