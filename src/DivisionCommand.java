
public class DivisionCommand implements CalculationCommand {

   @Override
   public double execute(double number1, double number2) {
      return number1 / number2;
   }

}
