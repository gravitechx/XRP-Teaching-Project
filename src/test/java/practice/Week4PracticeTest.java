package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Week 4 Practice Problems: Java Methods, Parameters, & Return Values
 * * Instructions:
 * 1. Run these tests via WPILib Command Palette: "WPILIB: Test Robot Code"
 * 2. Complete the methods and internal logic below so all tests pass.
 * 3. Stage, commit, and push changes on your branch ([FirstName][LastInitial]) with your initials!
 */

/*
public class Week4PracticeTest {

    // =========================================================================
    // HELPER CLASSES (For Practice Exercises)
    // =========================================================================

     // PRACTICE 4.1: Void Methods & Mutators (Setters)
    public static class PracticeFlywheel {
        private double targetRPM;
        private boolean isRunning;

        public PracticeFlywheel() {
            this.targetRPM = 0.0;
            this.isRunning = false;
        }

        // TODO 1: Write a public void method named 'spinUp' that takes a double parameter 'rpm'
        // - Sets 'this.targetRPM' to the parameter 'rpm'
        // - Sets 'this.isRunning' to true
        

        // TODO 2: Write a public void method named 'stop' (no parameters)
        // - Sets 'this.targetRPM' to 0.0
        // - Sets 'this.isRunning' to false
        

        // Getter methods to support assertions (Do not modify)
        public double getTargetRPM() { return this.targetRPM; }
        public boolean getIsRunning() { return this.isRunning; }
    }

     // PRACTICE 4.2: Return Values & Accessors (Getters)
    public static class PracticeEncoder {
        private int rawTicks;
        private final double TICKS_PER_REVOLUTION = 2048.0;

        public PracticeEncoder(int initialTicks) {
            this.rawTicks = initialTicks;
        }

        // TODO 1: Write a public method 'getRawTicks' that returns an int
        

        // TODO 2: Write a public method 'getRevolutions' that returns a double
        // Formula: rawTicks / TICKS_PER_REVOLUTION
        

        // Helper method to set ticks during tests
        public void setRawTicks(int ticks) {
            this.rawTicks = ticks;
        }
    }

    // PRACTICE 4.3: Boolean Condition Methods & Clamping Logic
    public static class PracticeArm {
        private double currentAngleDegrees;
        private final double MIN_ANGLE = 0.0;
        private final double MAX_ANGLE = 120.0;

        public PracticeArm(double startingAngle) {
            this.currentAngleDegrees = startingAngle;
        }

        // TODO 1: Write a public void method 'setAngle(double newAngle)'
        // - If newAngle < MIN_ANGLE, set currentAngleDegrees to MIN_ANGLE
        // - If newAngle > MAX_ANGLE, set currentAngleDegrees to MAX_ANGLE
        // - Otherwise, set currentAngleDegrees to newAngle
        public void setAngle(double newAngle) {
            
        }

        // TODO 2: Write a public method 'isAtTopLimit()' returning a boolean
        // Returns true if currentAngleDegrees == MAX_ANGLE, otherwise false
        

        // Getter method (Do not modify)
        public double getAngle() { return this.currentAngleDegrees; }
    }


    // =========================================================================
    // JUNIT UNIT TESTS
    // =========================================================================
    // TODO Uncomment tests 
    // @Test
    public void test1_VoidMethodsAndStateChanges() {
        PracticeFlywheel flywheel = new PracticeFlywheel();

        // Initial state
        assertEquals(0.0, flywheel.getTargetRPM(), 0.001, "Flywheel initial RPM should be 0");
        assertFalse(flywheel.getIsRunning(), "Flywheel initially should not be running");

        // Execute spinUp
        flywheel.spinUp(3000.0);
        assertEquals(3000.0, flywheel.getTargetRPM(), 0.001, "Flywheel target RPM should update to 3000");
        assertTrue(flywheel.getIsRunning(), "Flywheel should be running after spinUp()");

        // Execute stop
        flywheel.stop();
        assertEquals(0.0, flywheel.getTargetRPM(), 0.001, "Flywheel target RPM should be 0 after stop()");
        assertFalse(flywheel.getIsRunning(), "Flywheel should not be running after stop()");
    }

    @Test
    public void test2_ReturnValuesAndCalculations() {
        PracticeEncoder encoder = new PracticeEncoder(4096);

        assertEquals(4096, encoder.getRawTicks(), "getRawTicks() should return 4096");
        assertEquals(2.0, encoder.getRevolutions(), 0.001, "4096 ticks should equal 2.0 revolutions");

        encoder.setRawTicks(1024);
        assertEquals(0.5, encoder.getRevolutions(), 0.001, "1024 ticks should equal 0.5 revolutions");
    }

    @Test
    public void test3_MethodClampingAndBooleanCheck() {
        PracticeArm arm = new PracticeArm(10.0);

        // Within normal limits
        arm.setAngle(45.0);
        assertEquals(45.0, arm.getAngle(), 0.001, "Arm angle should set to 45.0");
        assertFalse(arm.isAtTopLimit(), "Arm should not be at top limit at 45 degrees");

        // Exceeding upper limit (should clamp to 120.0)
        arm.setAngle(150.0);
        assertEquals(120.0, arm.getAngle(), 0.001, "Arm angle should clamp to MAX_ANGLE (120.0)");
        assertTrue(arm.isAtTopLimit(), "Arm should report true for isAtTopLimit() when at 120 degrees");

        // Below lower limit (should clamp to 0.0)
        arm.setAngle(-15.0);
        assertEquals(0.0, arm.getAngle(), 0.001, "Arm angle should clamp to MIN_ANGLE (0.0)");
        assertFalse(arm.isAtTopLimit(), "Arm should report false for isAtTopLimit() when at 0 degrees");
    }
}

*/