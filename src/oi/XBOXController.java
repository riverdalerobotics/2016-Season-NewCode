package oi;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class XBOXController extends Controller {

	Joystick joystick = new Joystick(0);

	public enum Button {

		A(1), B(2), Y(4), X(3), START(8), BACK(7), RIGHT_BUMPER(6), LEFT_BUMPER(5), RIGHT_JOYSTICK(10), LEFT_JOYSTICK(
				9);

		private int port;

		Button(int port) {
			this.port = port;
		}

		public int getPort() {
			return this.port;
		}
	}

	public enum Axis {

		LEFT_X(0), LEFT_Y(1), LEFT_TRIGGER(2), RIGHT_X(4), RIGHT_Y(5), RIGHT_TRIGGER(3);

		private int port;

		Axis(int port) {
			this.port = port;
		}

		public int getPort() {
			return this.port;
		}

	}

	public boolean isAnyButtonPressed() {
		return isADown() || isBDown() || isXDown() || isYDown() || isLeftBumperDown()
				|| isLeftJoystickDown() || isRightBumperDown() || isRightJoystickDown();
	}

	public boolean isADown() {
		return joystick.getRawButton(Button.X.getPort());
	}

	public boolean isBDown() {
		return joystick.getRawButton(Button.B.getPort());
	}

	public boolean isXDown() {

		return joystick.getRawButton(Button.X.getPort());
	}

	public boolean isYDown() {
		return joystick.getRawButton(Button.Y.getPort());
	}

	public boolean isRightBumperDown() {
		return joystick.getRawButton(Button.RIGHT_BUMPER.getPort());
	}

	public boolean isLeftBumperDown() {
		return joystick.getRawButton(Button.LEFT_BUMPER.getPort());
	}

	public boolean isSide1Down() {
		return joystick.getRawButton(Button.BACK.getPort());
	}

	public boolean isSide2Down() {
		return joystick.getRawButton(Button.START.getPort());
	}

	public boolean isRightJoystickDown() {
		return joystick.getRawButton(Button.RIGHT_JOYSTICK.getPort());
	}

	public boolean isLeftJoystickDown() {
		return joystick.getRawButton(Button.LEFT_JOYSTICK.getPort());
	}

	public double getLeftX() {
		return joystick.getRawAxis(Axis.LEFT_X.getPort());
	}

	public double getLeftY() {
		return joystick.getRawAxis(Axis.LEFT_Y.getPort());
	}

	public double getRightX() {
		return joystick.getRawAxis(Axis.RIGHT_X.getPort());
	}

	public double getRightY() {
		return joystick.getRawAxis(Axis.RIGHT_Y.getPort());
	}

	public double getLeftTrigger() {
		return joystick.getRawAxis(Axis.LEFT_TRIGGER.getPort());
	}

	public double getRightTrigger() {
		return joystick.getRawAxis(Axis.RIGHT_TRIGGER.getPort());
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		
		sb.append(	"Left Axis: X - " + getLeftX() + ", Y - " + getLeftY() + "  Left Trigger: " + getLeftTrigger());
		sb.append(System.getProperty("line.separator"));
		sb.append( "Right Axis: X - " + getRightX() + ", Y - " + getRightY() + "  Right Trigger: " + getRightTrigger());
		sb.append(System.getProperty("line.separator"));
		sb.append(System.getProperty("line.separator"));
		sb.append("Buttons Pressed: ");
		
		return sb.toString();
	}
}
