package Commands;

import edu.wpi.first.wpilibj.command.Command;
import robot.Robot;

public class Joystick extends Command {

    public Joystick() {
        requires(Robot.chassisSubsystem);
        requires(Robot.shooterSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double speed = Robot.oi.getSpeed();
    	double turn = Robot.oi.getTurn();
  
    	Robot.chassisSubsystem.setSpeed(speed,turn);
    	
    	if(Robot.oi.isIntakePressed()){
    		
    		Robot.shooterSubsystem.IntakeBall();
    		
    	}else if(Robot.oi.isLowOutakePressed()){
    		
    		Robot.shooterSubsystem.LowOutake();
    	
    	}else if(Robot.oi.isHighOutakePressed()){
    	
    		Robot.shooterSubsystem.HighOutake();
    	
    	}else{
    		Robot.shooterSubsystem.isBallIn();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
