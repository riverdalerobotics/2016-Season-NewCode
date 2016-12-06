package oi;


public class OI {
    
	//TODO: Update Smart Dashboard
	//	ToString method for the controller input
	
	public OI(){}

	Controller joystick = new Controller();
	
	public double getSpeed(){
		return -joystick.getLY();
	}
	
	public double getTurn(){
		return joystick.getRX();
	}

	public boolean getIntake(){
		return joystick.getLT() > 0.1;
	}
}

