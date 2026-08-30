package practice.Week5;

/**
 * Practice Problem 2.1 & 2.2: Static Utility Methods
 */
public class RobotMathUtils {

    /**
     * Applies a deadband threshold to raw joystick input.
     */
    public static double applyDeadband(double input, double deadbandThreshold) {
        if (Math.abs(input) < deadbandThreshold) {
            return 0.0;
        }
        return input;
    }

    /**
     * Converts Revolutions Per Minute (RPM) to Radians Per Second.
     */
    public static double rpmToRadsPerSec(double rpm) {
        return (rpm * 2.0 * Math.PI) / 60.0;
    }
}