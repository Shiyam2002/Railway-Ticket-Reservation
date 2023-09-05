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
	static int availableRACTickets = 18;
	static int availableWaitingList = 10;
	
	static List<Integer> bookedTicket = new ArrayList<>();
	static Queue<Integer> racList = new LinkedList<>();
	static Queue<Integer> watingList = new LinkedList<>();
	
	static List<Integer> lowerBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> middleBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> upperBerthPosition = new ArrayList<>(Arrays.asList(20));
	static List<Integer> racListPosition = new ArrayList<>(Arrays.asList(18));
	static List<Integer> waitingListPosition = new ArrayList<>(Arrays.asList(10));
	
	static Map<Integer, passengerDetails> passenger = new HashMap<>();
	
	public void Booking(passengerDetails p, int berthInfo, String allocated) {
		//Assignment Seat Number
		p.seatNo = berthInfo;
		//Assignment of Berth Allotment
		p.allocated = allocated;
		//Storing the ID and passrnger to map
		passenger.put(p.passengerID, p);
		//Storing passenger to the booking list
		bookedTicket.add(p.passengerID);
	}
	
	public void addToRAC(passengerDetails p, int racInfo, String allocatedrac) {
		//Assignment Seat Number
		p.seatNo = racInfo;
		//Assignment of rac Allotment
		p.allocated = allocatedrac;
		//Storing the ID and passenger to map
		passenger.put(p.passengerID, p);
		//add passenger id to the queue of RAC tickets
		racList.add(p.passengerID);
		//decrease available RAC tickets by 1    
		availableRACTickets--;
		//remove the position that was alloted to the passenger
		racListPosition.remove(0);
	}
	
	public void addtoWaitingList(passengerDetails p,int waitInfo, String allocatedWL) {
		//Assignment Seat Number
		p.seatNo = waitInfo;
		//Assignment of rac Allotment
		p.allocated = allocatedWL;
		//Storing the ID and passenger to map
		passenger.put(p.passengerID, p);
		//add passenger id to the queue of RAC tickets
		watingList.add(p.passengerID);
		//decrease available RAC tickets by 1 
		availableWaitingList--;
		//remove the position that was alloted to the passenger
		waitingListPosition.remove(0);
	}
	
	public void cancelling(int passengerID) {
		
	}
	
	public void printAvailableTickets() {
		System.out.println("Available Lower Berths "+availableLowerBerth);
		System.out.println("Available Middle Berths "+availableMiddleBerth);
		System.out.println("Available Upper Berths "+availableUpperBerth);
		System.out.println("Available RAC Tickets "+availableRACTickets);
		System.out.println("Available Waiting List "+availableWaitingList);
	}
	
	public void printPassenger() {
		if(passenger.size() == 0) {
			System.out.println("No Details of Passenger");
			return;
		}
		for(passengerDetails p : passenger.values()) {
			System.out.println("PASSENGER ID : "+p.passengerID);
			System.out.println("Name"+p.name);
			System.out.println("Age "+p.age);
			System.out.println("Status"+p.allocated);
		}
	}
}
