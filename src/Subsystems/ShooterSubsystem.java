package Subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import robot.RobotMap;

public class ShooterSubsystem extends Subsystem {
    
	Victor intakeMotor = new Victor(RobotMap.ShooterMap.INTAKE_MOTOR.getPort());
	Victor liftMotor = new Victor(RobotMap.ShooterMap.LIFT_MOTOR.getPort());
	Victor shooterMotor = new Victor(RobotMap.ShooterMap.SHOOTER_HIGH.getPort());

	AnalogInput ballSensor = new AnalogInput(RobotMap.ShooterMap.SENSOR.getPort());
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void isBallIn(){
    	if(ballSensor.getAverageVoltage() <= 0.25){
    		intakeMotor.set(0.0);
    	}else{
    		intakeMotor.set(0.0);
    		liftMotor.set(0.0);
    	}
    }
    
    public void IntakeBall(){
    	intakeMotor.set(1.0);
    	isBallIn();
    }
    
    public void LowOutake(){
    	intakeMotor.set(1.0);
    	liftMotor.set(1.0);
    	isBallIn();
    }
    
    public void HighOutake(){
    	shooterMotor.set(1.0);
    	liftMotor.set(1.0);
    	isBallIn();
    }
    
    public void updateDashboard(){
    	SmartDashboard.putString("Intake Motor", Double.toString(intakeMotor.get()));
    	SmartDashboard.putString("High Goal Shooter Motor", Double.toString(shooterMotor.get()));
    }
}

