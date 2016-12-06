package oi;

import edu.wpi.first.wpilibj.Joystick;

//TODO: Make Controller to an abstract class
public abstract class Controller {

	Joystick joystick = new Joystick(0);

	// TODO: Externalize Controller to an XBOX class that extends Controller
	// TODO: Finish all the button and axis enums

	public abstract boolean isAnyButtonPressed();

	public abstract boolean isADown();

	public abstract boolean isBDown();

	public abstract boolean isXDown();

	public abstract boolean isYDown();

	public abstract boolean isRightBumperDown();

	public abstract boolean isLeftBumperDown();

	public abstract boolean isSide1Down();

	public abstract boolean isSide2Down();

	public abstract boolean isRightJoystickDown();

	public abstract boolean isLeftJoystickDown();

	public abstract double getLeftX();

	public abstract double getLeftY();

	public abstract double getRightX();

	public abstract double getRightY();

	public abstract double getLeftTrigger();

	public abstract double getRightTrigger();
}
