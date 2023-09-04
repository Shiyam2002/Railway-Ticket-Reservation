package RailwayBookingCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBooking {
	
	// There will be total of 60 berths[U,M and L]
	// THere will be total of 18 RAC 
	// There will be total of 10 Waiting List
	static int availableLowerBerth = 20;
	static int availableMiddleBerth = 20;
	static int availableUpperBerth = 20;
	
	static List<Integer> bookedTicket = new ArrayList<>();
	static Queue<Integer> racList = new LinkedList<>();
	static Queue<Integer> watingList = new LinkedList<>();
	
	static List<Integer> lowerBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> middleBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> upperBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> racListPosition = new ArrayList<>(Arrays.asList(18));
	static List<Integer> waitingListPosition = new ArrayList<>(Arrays.asList(10));
	
	static Map<Integer, passengerDetails> passenger = new HashMap<>();
}
