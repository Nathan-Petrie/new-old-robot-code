package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GoUpScore50 extends Command {
	public GoUpScore50() {
		requires(Robot.climber);
	}

	protected void initialize() {
		Robot.climber.climb();
	}
	
	@Override
	protected boolean isFinished() {
		
		return false;
	}

}
