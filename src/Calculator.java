import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {

      char operator;
      Double number1, number2, result;
      
      Map<Character, CalculationCommand> commands = new HashMap<Character, CalculationCommand>();
      commands.put('+', new AdditionCommand());
      commands.put('-', new SubtractionCommand());
      commands.put('*', new MultiplicationCommand());
      commands.put('/', new DivisionCommand());

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter operator (either +, -, * or /): ");

      operator = scanner.next().charAt(0);

      System.out.print("Enter number1 and number2 respectively: ");

      number1 = scanner.nextDouble();
      number2 = scanner.nextDouble();
      
      CalculationCommand command = commands.get(operator);
      
      if (command == null) {
         System.out.println("Invalid operator!");
         return;
      }
      
      result = command.execute(number1, number2);
      
      System.out.print(number1 + " " + operator + " " + number2 + " = " + result);
   }
}
