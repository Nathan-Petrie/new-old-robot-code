package org.usfirst.frc.team4610.robot;

import org.usfirst.frc.team4610.robot.commands.GoUpScore50;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
		private Joystick joy = new Joystick(0);
		
		
		public OI() {
			new JoystickButton(joy,5).whenPressed(new GoUpScore50());
		}
		
		public Joystick getJoystick() {
			return joy;
		}
}
