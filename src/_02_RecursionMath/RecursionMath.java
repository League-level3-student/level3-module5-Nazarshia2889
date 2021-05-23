package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 

        // Else return number + recursionMultiplication(number, times-1)
    	if(times == 1) {
			return number;
		}
		else {
			return number + recursiveMultiplication(number, times-1);
		}
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDevideBy) {
    	if(numberToDevideBy <= number) {
			return 1 + recursiveDivision(number-numberToDevideBy, numberToDevideBy);
		}
		else {
			return 0;
		}
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
    	if(power == 1) {
			return number;
		}
		else {
			return number * recursivePower(number, power-1);
		}
    }
}
