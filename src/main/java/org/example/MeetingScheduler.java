package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {
    private User organizer;
    private Calendar calendar;
    private List<MeetingRoom> rooms;

    private MeetingScheduler() {
        this.rooms = new ArrayList<>();
        this.calendar = new Calendar();
    }
    private static MeetingScheduler scheduler = null;

    public static MeetingScheduler getInstance() {
        if (scheduler == null ) {
            scheduler = new MeetingScheduler();
        }
        return scheduler;
    }

    public void addMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.rooms.addAll(meetingRooms);
    }


    public boolean scheduleMeeting(List<User> userList, Interval interval, String subject) {
        // room chaiye free ho
        int numOfPersons = userList.size() + 1;
        MeetingRoom availableRoom = checkRoomsAvailability(numOfPersons, interval);
        if(availableRoom == null) {
            return false;
        }
        bookRoom(availableRoom, numOfPersons, interval);
        Meeting meeting = new Meeting(numOfPersons, userList, interval, availableRoom, subject);
        calendar.addMeeting(meeting);

        System.out.println("Meeting : " + meeting.getSubject() + " scheduled in room for capacity " + availableRoom.getCapacity());
        return true;
    }

    public boolean cancelMeeting(List<User> users, Interval interval) {
        Meeting meeting = calendar.getMeetings().stream().filter(m -> m.getInterval() == interval).findFirst().orElse(null);
        if(meeting == null) {
            return false;
        }
        calendar.getMeetings().remove(meeting);
        System.out.println("Meeting cancelled for interval : " + interval.getStartTime() + " to " + interval.getEndTime());
        return true;
    }

    public void bookRoom(MeetingRoom room, int numberOfPersons, Interval interval) {
        room.setAvailable(false);
        room.addBookedInterval(interval);
    }
    public MeetingRoom checkRoomsAvailability(int numberOfPersons, Interval interval) {
        // algorithm

        for(int i=0; i<rooms.size(); i++) {

            if(rooms.get(i).isAvailable() && rooms.get(i).getCapacity() >= numberOfPersons) {
                return rooms.get(i);
            }
        }
        return null;
    }








}
