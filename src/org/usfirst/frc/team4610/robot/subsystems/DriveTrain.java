package org.usfirst.frc.team4610.robot.subsystems;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


/**
 * The DriveTrain subsystem incorporates the actuators attached to
 * the robots chassis. These include 6 drive motors
 */
public class DriveTrain extends Subsystem {
	private SpeedController frontLeftMotor = new Talon(1);
	private SpeedController rearLeftMotor = new Talon(2);
	private SpeedController frontRightMotor = new Talon(4);
	private SpeedController rearRightMotor = new Talon(5);
	

	private RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

	
	public DriveTrain() {
		super();

		// Encoders may measure differently in the real world and in
		// simulation. In this example the robot moves 0.042 barleycorns
		// per tick in the real world, but the simulated encoders
		// simulate 360 tick encoders. This if statement allows for the
		// real robot to handle this difference in devices.
		

		// Let's show everything on the LiveWindow
		LiveWindow.addActuator("Drive Train", "Front_Left Motor", (Talon) frontLeftMotor);
		LiveWindow.addActuator("Drive Train", "Back Left Motor", (Talon) rearLeftMotor);
		LiveWindow.addActuator("Drive Train", "Front Right Motor", (Talon) frontRightMotor);
		LiveWindow.addActuator("Drive Train", "Back Right Motor", (Talon) rearRightMotor);
		
		
	}

	/**
	 * When no other command is running let the operator drive around using the
	 * PS3 joystick.
	 */
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new TankDriveWithJoystick());
	}

	public void drive(double left, double right) {
		drive.tankDrive(left, right);
	}

	/**
	 * @param joy
	 *            The ps3 style joystick to use to drive tank style.
	 */
	public void drive(Joystick joy) {
		drive(-joy.getY(), -joy.getAxis(AxisType.kThrottle));
	}

}
