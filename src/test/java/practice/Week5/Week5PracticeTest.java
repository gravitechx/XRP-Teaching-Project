package practice.Week5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/*
public class Week5PracticeTest {
    // TODO Uncomment out every test
    @Test
    void testVoltageClampingAndEStop() {
        EncapsulatedShooter shooter = new EncapsulatedShooter();

        // Over-voltage test
        shooter.setVoltage(15.0);
        assertEquals(12.0, shooter.getVoltage(), 0.001);

        // Under-voltage test
        shooter.setVoltage(-18.0);
        assertEquals(-12.0, shooter.getVoltage(), 0.001);

        // Normal voltage test
        shooter.setVoltage(8.5);
        assertEquals(8.5, shooter.getVoltage(), 0.001);

        // E-stop test
        // shooter.triggerEStop();
        // assertTrue(shooter.isEStopped());
        // assertEquals(0.0, shooter.getVoltage(), 0.001);

        // Attempting to set voltage while E-stopped should be ignored
        shooter.setVoltage(10.0);
        assertEquals(0.0, shooter.getVoltage(), 0.001);

        // Reset E-stop and re-test
        // shooter.resetEStop();
        // assertFalse(shooter.isEStopped());
        shooter.setVoltage(10.0);
        assertEquals(10.0, shooter.getVoltage(), 0.001);
    }

    @Test
    void testRobotMathUtils() {
        // Deadband tests
        assertEquals(0.0, RobotMathUtils.applyDeadband(0.03, 0.05), 0.001);
        assertEquals(0.0, RobotMathUtils.applyDeadband(-0.02, 0.05), 0.001);
        assertEquals(0.8, RobotMathUtils.applyDeadband(0.8, 0.05), 0.001);
        assertEquals(-0.8, RobotMathUtils.applyDeadband(-0.8, 0.05), 0.001);

        // RPM to Rad/s test (6000 RPM ≈ 628.318 rad/s)
        assertEquals(628.318, RobotMathUtils.rpmToRadsPerSec(6000.0), 0.01);
    }

    @Test
    void testCommandLifecycle() {
        MockTimedCommand command = new MockTimedCommand();

        command.initialize();
        assertTrue(command.wasInitialized);

        // Run 3 cycles
        for (int i = 0; i < 3; i++) {
            command.execute();
        }
        assertFalse(command.isFinished());

        // Run 2 more cycles (5 total)
        command.execute();
        command.execute();
        assertTrue(command.isFinished());

        command.end(false);
        assertTrue(command.wasEnded);
        assertFalse(command.endInterruptedValue);
    }

    @Test
    void testRunIntakeTimedCommand() {
        PracticeIntake intake = new PracticeIntake();
        RunIntakeTimedCommand command = new RunIntakeTimedCommand(intake);

        // Verify subsystem requirement declaration
        assertTrue(command.getRequirements().contains(intake));

        // Test execution cycle
        assertFalse(intake.isRunning());
        command.initialize();
        assertTrue(intake.isRunning());

        command.end(false);
        assertFalse(intake.isRunning());
    }
}
*/