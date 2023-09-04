package RailwayBookingCounter;

public class passengerDetails {
	
	private static int id;
	private String name;
	private int age;
	private String berthPerference; //U,M or L
	private int passengerID;
	private String allocated; //Allocated type U,M,L,RAC or WL
	private int seatNo; 
	
	public passengerDetails(String name, int age, String berthPerference) {
		this.name = name;
		this.age = age;
		this.berthPerference = berthPerference;
		this.passengerID = id++;
	}

}
