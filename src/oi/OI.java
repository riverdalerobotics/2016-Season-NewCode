package oi;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
    
	//TODO: Update Smart Dashboard
	//	ToString method for the controller input
	
	public OI(){}

	XBOXController joystick = new XBOXController();
	
	public double getSpeed(){
		return -joystick.getLeftY();
	}
	
	public double getTurn(){
		return joystick.getRightX();
	}

	public boolean isIntakePressed(){
		return joystick.getLeftTrigger() > 0.1;
	}
	
	public boolean isHighOutakePressed(){
		return joystick.isRightBumperDown();
	}
	
	public boolean isLowOutakePressed(){
		return joystick.isLeftBumperDown();
	}
	
	public void updateDashboard(){
		
		SmartDashboard.putString("Speed", Double.toString(getSpeed()));
		SmartDashboard.putString("Turn", Double.toString(getTurn()));
		SmartDashboard.putBoolean("Intake Button", isIntakePressed());
		SmartDashboard.putBoolean("Shoot High Button", isHighOutakePressed());
		SmartDashboard.putBoolean("Shoot Low Button", isLowOutakePressed());

	}
}

