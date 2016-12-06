package robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public enum MotorMap{
		LEFT_MOTOR(1),RIGHT_MOTOR(0), LEFT_ENCODER_1(8),
			LEFT_ENCODER_2(9), RIGHT_ENCODER_1(0), RIGHT_ENCODER_2(1);
		
		private int port;
		MotorMap(int port){
			this.port = port;
		}
		
		public int getPort(){
			return this.port;
		}
	}
	
	public enum EncoderMap{
		LEFT_ONE(9), LEFT_TWO(8), RIGHT_ONE(0), RIGHT_TWO(1);
		
		int port;
		EncoderMap(int port){
			this.port = port;
		}
		
		public int getPort() {
			return this.port;
		}
	}
	
	public enum ShooterMap{
		LIFT_MOTOR(2),SHOOTER_ONE(3),SHOOTER_TWO(4);
		
		int port;
		ShooterMap(int port){
			this.port = port;
		}
	}
}
