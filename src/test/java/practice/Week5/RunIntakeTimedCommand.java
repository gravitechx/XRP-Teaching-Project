package practice.Week5;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * Practice Problem 4.1: Timed Command with Subsystem Requirements
 */
public class RunIntakeTimedCommand extends Command {
    private final PracticeIntake intake;
    private int loopCounter = 0;
    // TODO Make the constructor take in an intake object and assign it to the intake field
    // TODO Call addRequirments and pass in the intake object 
    public RunIntakeTimedCommand() {
        intake = null;
    }

    @Override
    public void initialize() {
        // TODO Read the PracticeIntake.java file and run the intake
        // TODO Reset the loopCounter variable to zero
    }
    
    @Override
    public void execute() {
        //TODO Increment loop counter
    }

    @Override
    public boolean isFinished() {
        // TODO make isFinished return true when loopCounter is greater than or equal to 10
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // TODO stop the intake
    }
}