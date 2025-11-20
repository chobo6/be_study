package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoom {
	int floor;
	int roomNumber;
	double area;
	boolean hasWhiteBoard;
	
	WhiteBoard whiteBoard;
	
	AirCon airCon;
	
//	Desk[] deskArr;
	ArrayList<Desk> deskList;
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		airCon = null;
		deskList = null;
	}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}
	
	public ClassRoom(WhiteBoard whiteBoard, AirCon airCon) {
		this.whiteBoard = whiteBoard;
		this.airCon = airCon;
//		this.deskList = new ArrayList<Desk>();
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	public void addDesk(Desk desk) {
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		deskList.add(desk);
	}
}
