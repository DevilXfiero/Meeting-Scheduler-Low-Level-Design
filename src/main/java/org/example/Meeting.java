package org.example;

import java.util.List;

public class Meeting {
//    private int id;
    private int participantsCount;
    private List<User> participants;
    private Interval interval;
    private MeetingRoom room;
    private String subject;

    private void addParticipants(List<User> participants) {
        this.participants.addAll(participants);
    }

    public Meeting(int participantsCount, List<User> participants, Interval interval, MeetingRoom room, String subject) {
        this.participantsCount = participantsCount;
        this.participants = participants;
        this.interval = interval;
        this.room = room;
        this.subject = subject;
    }

    public int getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public MeetingRoom getRoom() {
        return room;
    }

    public void setRoom(MeetingRoom room) {
        this.room = room;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
