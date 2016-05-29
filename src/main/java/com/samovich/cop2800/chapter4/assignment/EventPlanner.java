package com.samovich.cop2800.chapter4.assignment;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Filename EventPlanner.java
 * Created by Valery Samovich
 * Written on 5/28/2016
 */
public class EventPlanner {

    public static void main(String[] args) {

        // declare variables
        String eventID;         // event number
        int numberOfGuests;     // number of guests
        int monthOfEvent;       // event month
        String eventDate;       // event date
        int dateOfEvent;        // event day
        int yearOfEvent;        // event year

        // instantiate an object of the Event class
        Event event1 = new Event();

        // display event information
        displayEvent(event1);

        // declare a Scanner to accept the keyboard input
        Scanner input = new Scanner(System.in);

        // prompt the user to accept two integers
        System.out.print("Enter the event number: ");
        eventID = input.nextLine();
        System.out.print("Enter the number of guests: ");
        numberOfGuests = input.nextInt();
        System.out.print("Enter the month of the event: ");
        monthOfEvent = input.nextInt();
        System.out.print("Enter the day of the event: ");
        dateOfEvent = input.nextInt();
        System.out.print("Enter the year of the event: ");
        yearOfEvent = input.nextInt();

        // create a GregorianCalendar object using a specific date
        GregorianCalendar inputDate = new GregorianCalendar(yearOfEvent, monthOfEvent, dateOfEvent);

        // instantiate an object of the Event class
        Event event2 = new Event(eventID, numberOfGuests);
        event2.setEventID(eventID);
        event2.setNumberOfGuests(numberOfGuests);
        //TODO: set input date from now object

        // display event information
        displayEvent(event2);
    }

    public static void displayEvent(Event event) {
        System.out.println("********************************");
        System.out.println("        Event ID: " + event.getEventID());
        System.out.println("        Number of guests: " + event.getNumberOfGuests());
        System.out.println("        Event date: " + event.getEventDate());
        System.out.println("        Event price: " + event.calculatePrice());
        System.out.println("********************************");
    }

}
