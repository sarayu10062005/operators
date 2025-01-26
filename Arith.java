public class Arith {
    public static void main(String[] args) {

        int num1 = 10, num2 = 5;
        System.out.printf("The numbers are: num1 = %d, num2 = %d\n", num1, num2);
        
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + num1 + num2);
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + num1 * num2);
        System.out.println("Division: " + num1 / num2);
        System.out.println("Modulus: " + num1 % num2);
        

        System.out.println("\nRelational Operators:");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        
  
        boolean cond1 = true, cond2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("condition1 AND condition2: " + (cond1 && cond2));
        System.out.println("condition1 OR condition2: " + (cond1 || cond2));
        System.out.println("NOT condition1: " + (!cond1));
    }
}
