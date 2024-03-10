package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
    private final Map<String,Integer> availableSeats;
    private final Map<String, Lock> seatTypeLocks;

    public ReservationSystem(Map<String, Integer> availableSeats) {
        this.availableSeats = new HashMap<>(availableSeats);
        this.seatTypeLocks = new HashMap<>();
        for (String seatType : availableSeats.keySet()) {
            seatTypeLocks.put(seatType, new ReentrantLock());
        }
    }

    // Complete the reserve seats method
    // The method will be called concurrently by multiple people trying to book multiple seats at same time
    public boolean reserveSeats(String seatType, int numSeats) {

    }
    public int getAvailableSeats(String seatType) {
        return availableSeats.getOrDefault(seatType, 0);
    }
    
}