package org.example;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MeetingScheduler meetingScheduler = MeetingScheduler.getInstance();
        User user1 = new User("abc", "abc@gmail.com");
        User user2 = new User("test", "test@gmail.com");
        MeetingRoom meetingRoom = new MeetingRoom(1, true);
        MeetingRoom meetingRoom1 = new MeetingRoom(30, true);
        meetingScheduler.addMeetingRooms(List.of(meetingRoom, meetingRoom1));
        List<User> userList = List.of(user1, user2);
        Interval interval = new Interval(1, 2);
        Interval interval1 = new Interval(2, 3);

        boolean scheduled = meetingScheduler.scheduleMeeting(userList, interval, "LLD discussion");

        if(!scheduled) {
            System.out.println("No meeting rooms available");
        }

        boolean cancelled = meetingScheduler.cancelMeeting(userList, interval1);
        if(!cancelled) {
            System.out.println("Failed to cancel meeting");
        }
        meetingScheduler.cancelMeeting(userList, interval);

        /* TODO:
        1. Add notification using observer pattern and respond notification for user
        2. Dynamically add users
        3. Meeting room selection strategy
         */
    }
}