package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Week 3 Practice Problems: Classes, Constructors, Fields & Parameters
 * * Instructions:
 * 1. Run these tests via WPILib Command Palette: "WPILIB: Test Robot Code"
 * 2. Complete the classes and constructor logic below so all tests pass.
 * 3. Stage, commit, and push changes on your branch ([FirstName][LastInitial]) with your initials!
 */

/*
public class Week3PracticeTest {

    // =========================================================================
    // HELPER CLASSES (For Practice Exercises)
    // =========================================================================

    // PRACTICE 3.1: Basic Class Structure
    // TODO: Define instance fields for this class.
    public static class PracticeFlywheel {
        // TODO: Declare two private instance fields:
        // 1. An int named 'canID'
        // 2. A double named 'maxRPM'
        

        // Default constructor
        public PracticeFlywheel() {
            // TODO: Initialize 'canID' to 10 and 'maxRPM' to 5690.0 inside this default constructor
            
        }

        // Getter methods to support assertions (Do not modify)
        //TODO Uncomment out the 4 lines below
        public int getCanID() { 
            return this.canID; 
        }
        public double getMaxRPM() { return this.maxRPM; }
    }

    // PRACTICE 3.2: Parameterized Constructor & 'this' Keyword
    // TODO: Implement the constructor using parameters and 'this'.
    public static class PracticeElevator {
        private int canID = -1;
        private double gearRatio = -1;
        private boolean isInverted = false;

        // TODO: Write a constructor that accepts (int canID, double gearRatio, boolean isInverted)
        public PracticeElevator(int canID, double gearRatio, boolean isInverted) {
            // TODO: Assign the parameter values to the instance fields using 'this'
            
        }

        // Getter methods to support assertions (Do not modify)
        public int getCanID() { return this.canID; }
        public double getGearRatio() { return this.gearRatio; }
        public boolean isInverted() { return this.isInverted; }
    }


    // =========================================================================
    // JUNIT UNIT TESTS
    // =========================================================================
    // TODO Uncomment this test
    @Test
    public void test1_DefaultConstructorAndInstanceFields() {
        // Instantiate a PracticeFlywheel using the default constructor
        PracticeFlywheel flywheel = new PracticeFlywheel();

        // Verify that default constructor properly set internal instance fields
        assertEquals(10, flywheel.getCanID(), "Flywheel default CAN ID should be 10");
        assertEquals(5690.0, flywheel.getMaxRPM(), 0.001, "Flywheel default max RPM should be 5690.0");
    }

    @Test
    public void test2_ParameterizedConstructorAndFieldAssignment() {
        // Instantiate two different PracticeElevator objects with distinct parameters
        PracticeElevator leftElevator = new PracticeElevator(5, 12.5, false);
        PracticeElevator rightElevator = new PracticeElevator(6, 12.5, true);

        // Verify left elevator initialization
        assertEquals(5, leftElevator.getCanID(), "Left elevator CAN ID should be 5");
        assertEquals(12.5, leftElevator.getGearRatio(), 0.001, "Left elevator gear ratio should be 12.5");
        assertFalse(leftElevator.isInverted(), "Left elevator should not be inverted");

        // Verify right elevator initialization
        assertEquals(6, rightElevator.getCanID(), "Right elevator CAN ID should be 6");
        assertEquals(12.5, rightElevator.getGearRatio(), 0.001, "Right elevator gear ratio should be 12.5");
        assertTrue(rightElevator.isInverted(), "Right elevator should be inverted");
    }

    @Test
    public void test3_ObjectInstantiationIndependence() {
        // Ensure instantiating multiple objects creates isolated state per instance
        PracticeElevator elevatorA = new PracticeElevator(1, 10.0, false);
        PracticeElevator elevatorB = new PracticeElevator(2, 20.0, true);

        assertNotEquals(elevatorA.getCanID(), elevatorB.getCanID(), "Elevator objects should have distinct CAN IDs");
        assertNotEquals(elevatorA.getGearRatio(), elevatorB.getGearRatio(), "Elevator objects should have distinct gear ratios");
    }
}
*/