package RailwayBookingCounter;

public class passengerDetails {
	
	private static int id;
	String name;
	int age;
	String berthPerference; //U,M or L
	int passengerID;
	String allocated; //Allocated type U,M,L,RAC or WL
	int seatNo; 
	
	public passengerDetails(String name, int age, String berthPerference) {
		this.name = name;
		this.age = age;
		this.berthPerference = berthPerference;
		this.passengerID = id++;
	}

}
