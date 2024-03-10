package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieReservationSystem {
    private int availableSeats;
    private final Lock reservationLock;

    //complete the given functions

    public MovieReservationSystem(int totalSeats) {
        //initialises lock and the total seats available for reservation
    }

    public boolean reserveSeats(int numSeats) {
        //Reserves `numSeats` seats if they are available
        //Hint: use lock() and unlock()
    }

    public int getAvailableSeats() {
        //returns total number of available seats for reservation
    }

}