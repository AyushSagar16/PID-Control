public class PIDController {
    // Instance Variables
    private final double kP_;
    private final double kI_;
    private final double kD_;

    // Constructor
    public PIDController(double kP, double  kI, double kD) {
        // Assigning Instance Variables
        kP_ = kP;
        kI_ = kI;
        kD_ = kD;
    }

    // Calculate Method - Returns output
    public double Calculate(double measurement, double setpoint) {
        double error = Math.abs(setpoint - measurement);
        double proportionalOutput = kP_ * error;

        double output = proportionalOutput;

        // Returns output
        return output;
    }
}
