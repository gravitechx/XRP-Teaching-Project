package practice.Week5;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Practice Problem 4.1: Dummy Subsystem for Integration Challenge
 */
public class PracticeIntake extends SubsystemBase {
    private boolean running = false;

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isRunning() {
        return running;
    }
}