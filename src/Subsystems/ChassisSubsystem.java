package Subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import robot.RobotMap;

public class ChassisSubsystem extends Subsystem {
    
    Victor leftMotor = new Victor(RobotMap.MotorMap.LEFT_MOTOR.getPort());
    Victor rightMotor = new Victor(RobotMap.MotorMap.RIGHT_MOTOR.getPort());
    

    Encoder leftEncoder = new Encoder(RobotMap.EncoderMap.LEFT_ONE.getPort(), RobotMap.EncoderMap.LEFT_TWO.getPort());
    Encoder rightEncoder = new Encoder(RobotMap.EncoderMap.RIGHT_ONE.getPort(), RobotMap.EncoderMap.RIGHT_TWO.getPort());
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double speed, double turn){
    	double leftSpeed = 0;
    	double rightSpeed = 0;
    	
    	//TODO: Add PID Controller!
    	
    	if(turn <= 0.1 && turn >= -0.1){
    		leftSpeed = speed;
    		rightSpeed = speed;
    	}else{
    		if(turn > 0.1){
		    	leftSpeed = speed;
		    	rightSpeed = speed/turn;
    		}else{
    			leftSpeed = speed/turn;
    			rightSpeed = speed;
    		}
    	}
    	
    	leftMotor.set(leftSpeed);
    	rightMotor.set(rightSpeed);
    }
    
    public void updateDashboard(){
    	SmartDashboard.putString("Right Motor: ", Double.toString(rightMotor.get()));
    	SmartDashboard.putString("Left Motor: ", Double.toString(leftMotor.get()));
    	SmartDashboard.putData("Left Encoder", leftEncoder);
    	SmartDashboard.putData("Right Encoder", leftEncoder);

    }
}

