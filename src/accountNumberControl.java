public class accountNumberControl {
    public static void control(String accountNumber) {
        // Step 1: First 2 letter control (first letter must be less than second one!)
        char letter1, letter2;
        letter1 = accountNumber.charAt(0); // first letter
        letter2 = accountNumber.charAt(1); // second letter

        if (letter1 >= letter2) {
            System.out.println("Your account number is invalid!");
            System.exit(0); // Exit the program
        }

        // Step 2: Prime number control
        int primeNumber, counter = 0;
        primeNumber = Integer.parseInt(accountNumber.substring(2, 4)); // Extract the number

        for (int h = 1; h <= primeNumber; h++) {
            if (primeNumber % h == 0) {
                counter++;
            }
        }

        if (counter != 2) { // If counter is not equal to 2, it's not a prime number
            System.out.println("Your account number is invalid!");
            System.exit(0); // Exit the program
        }

        // Step 3: Checksum control
        String lastNumbers = accountNumber.substring(4);
        int sum1 = 0, sum2 = 0, temp3 = 0, total = 0;
        String tempStr;

        // Loop to control whether the double of each number is greater than 10
        for (int f = 0; f < 12; f += 2) {
            int currentNum = Integer.parseInt(String.valueOf(lastNumbers.charAt(f)));

            if (currentNum * 2 < 10) {
                sum1 += currentNum * 2; // Add if less than 10
            } else {
                temp3 = currentNum * 2; // If greater than 10, split and sum the digits
                tempStr = String.valueOf(temp3);
                sum1 += Integer.parseInt(String.valueOf(tempStr.charAt(0))) +
                        Integer.parseInt(String.valueOf(tempStr.charAt(1)));
            }
        }

        // Sum loop for other digits
        for (int g = 1; g < 12; g += 2) {
            sum2 += Integer.parseInt(String.valueOf(lastNumbers.charAt(g)));
        }

        // Final checksum validation
        total = sum1 + sum2;
        if (total % 10 == 0) {
            System.out.println("Account number is valid!");
        } else {
            System.out.println("Account number is invalid!");
            System.exit(0); // Exit the program
        }
    }
}
