/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4682.Audacity.commands;

/**
 *
 * @author luis
 */
public class FeederToEndpoint extends CommandBase {
    
    public FeederToEndpoint() {
        requires(feeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.print("Initializing Feeder to End point command");
        if(feeder.atEndLimit()) {
            System.out.print("Feeder is at the end limit");
        }
        else {
            System.out.print("Feeder is not at the end limit");
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        feeder.setSpeed(0.3);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return feeder.atEndLimit();
    }

    // Called once after isFinished returns true
    protected void end() {
        feeder.setSpeed(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
