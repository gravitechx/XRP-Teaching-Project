package practice.Week5;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * Practice Problem 3.1: Command Execution Tracker
 */
public class MockTimedCommand extends Command {
    /*
     * Create each variable
     * wasInitialized (false)
     * executeCount (0)
     * wasEnded (false)
     * endInterruptedValue (false)
     */
    @Override
    public void initialize() {
        // set wasInitialized to true
    }

    @Override
    public void execute() {
        // add 1 to executeCount
    }
    // TODO Uncomment method
    // return if executeCount is greater or equal to 5
    // @Override
    // public boolean isFinished() {

    // }

    @Override
    public void end(boolean interrupted) {
        // set wasEnded to true
        // set endInterruptedValue to interrupted paramater
    }
}