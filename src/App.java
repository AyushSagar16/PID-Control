public class App {

    

    public static void main(String[] args) throws Exception {
        final PIDController controller_ = new PIDController(5.0, 0, 0);
        double startingVal = 100;
        double targetVal = 200;

        double error = Math.abs(targetVal - startingVal);
        System.out.println(error);

        while (error >= 1) {
            startingVal += controller_.Calculate(startingVal, targetVal);
            System.out.println("The output is " + controller_.Calculate(startingVal, targetVal));
            error = Math.abs(targetVal - startingVal);
            System.out.println("The Error is: " + error);
            System.out.println("The Current Value is: " + startingVal);
        }
    }
}
