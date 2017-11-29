package org.usfirst.frc.team4610.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	private SpeedController climbMotor = new Victor(6);
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void climb() {
		climbMotor.set(1);
	}
}
