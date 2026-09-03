package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Week 2 Practice Problems: Java Fundamentals & Logic Testing
 * * Instructions:
 * 1. Run these tests via WPILib Command Palette: "WPILIB: Test Robot Code"
 * 2. Edit the variables and logic below so all tests pass.
 * 3. Stage, commit, and push changes on your branch ([FirstName][LastInitial]) with your initials!
 */

/*
public class Week2PracticeTest {

    // =========================================================================
    // LESSON 2.1: VARIABLES & COMMENTS
    // =========================================================================
    @Test
    public void test1_VariableTypesAndAssignment() {
        // TODO: Assign correct values to the variables to make assertions pass.

        // EXAMPLE: declare and assign a string (name) for the robot name
        String name = "Elia";

        // assign an integer 1 for the robot's CAN ID
        int driveCanID = 423;

        // Declare and assign a double 0.85 for default motor speed percentage (0.0 to 1.0)
        double defaultSpeed = 23.34;

        // Declare and assign a boolean true indicating if the brake mode is active
        boolean isBrakeEnabled = false;

        // Declare and assign a String (subteamName) for the subteam name
        String subteamName = "";

        // --- DO NOT MODIFY BELOW THIS LINE ---
        assertEquals(1, driveCanID, "driveCanID should equal 1");
        assertEquals(0.85, defaultSpeed, 0.001, "defaultSpeed should equal 0.85");
        assertTrue(isBrakeEnabled, "isBrakeEnabled should be true");
        assertEquals("Programming", subteamName, "subteamName should equal 'Programming'");
    }

    @Test
    public void test2_ManipulatingVariablesAndComments() {
        double leftMotorSpeed = 0.50;
        double rightMotorSpeed = 0.50;

        // TODO: Add 0.10 to leftMotorSpeed


        // TODO: Fix the line below by uncommenting it.
        // Hint: Use Ctrl + / (or Cmd + /) to quickly toggle comments.

        // rightMotorSpeed = rightMotorSpeed * 2.0;

        // TODO: Comment out the line below so leftMotorSpeed isn't reset to zero!
        leftMotorSpeed = 0.0;

        // --- DO NOT MODIFY BELOW THIS LINE ---
        assertEquals(0.60, leftMotorSpeed, 0.001, "leftMotorSpeed should be 0.60");
        assertEquals(1.00, rightMotorSpeed, 0.001, "rightMotorSpeed should be 1.00");
    }


    // =========================================================================
    // LESSON 2.2: CONDITIONALS & BOOLEAN LOGIC
    // =========================================================================

     // Helper method simulating speed limit checks for safety.
    private double calculateSafeSpeed(double reqSpeed, boolean eStop) {
        boolean emergencyStop = eStop;
        double requestedSpeed = reqSpeed;
        double returnValue = 0;
        
        // TODO: Implement conditional logic:
        // 1. If emergencyStop is true, set returnValue to 0.0 immediately.
        // 2. Else if requestedSpeed is greater than 1.0, set returnValue to 1.0.
        // 3. Else if requestedSpeed is less than -1.0, set returnValue to -1.0.
        // 4. Otherwise, set returnValue to requestedSpeed.



        return returnValue;
    }

    
    // Helper method simulating boolean operations for subsystem readiness.
    private boolean isRobotReadyToDrive(boolean hasBatPower, boolean isDSConn, boolean hasProblems) {
        boolean hasBatteryPower = hasBatPower;
        boolean isDSConnected = isDSConn;
        boolean hasErrors = hasProblems;
        boolean returnValue = false;
        // TODO: set returnValue to true ONLY IF the battery is powered AND DriverStation is connected AND there are NO errors.
        // Use logical operators (&&, ||, !)
        
        
        return returnValue;
    }
    // TODO Uncomment out these tests
    // Hint: highlight both tests and use Ctrl + /
    @Test
    public void test3_ControlFlowAndConditionals() {
        assertEquals(0.0, calculateSafeSpeed(0.8, true), "Should return 0.0 when emergency stop is active");
        assertEquals(1.0, calculateSafeSpeed(1.5, false), "Should cap requested speed above 1.0 down to 1.0");
        assertEquals(-1.0, calculateSafeSpeed(-1.2, false), "Should cap requested speed below -1.0 up to -1.0");
        assertEquals(0.45, calculateSafeSpeed(0.45, false), "Should return exact speed when within safe range");
    }
    
    @Test
    public void test4_BooleanLogicOperators() {
        assertTrue(isRobotReadyToDrive(true, true, false), "Robot should be ready when powered, connected, and error-free");
        assertFalse(isRobotReadyToDrive(false, true, false), "Robot should NOT be ready without battery power");
        assertFalse(isRobotReadyToDrive(true, false, false), "Robot should NOT be ready without DS connection");
        assertFalse(isRobotReadyToDrive(true, true, true), "Robot should NOT be ready if there are active errors");
    }
}
*/