
public class accountNumberControl {
    public static void control (String accountNumber){
        //first 2 letter control( first letters have to less than second one!)
        char letter1, letter2;
        letter1 = accountNumber.charAt(0); // first letter musT be less than second one
        letter2 = accountNumber.charAt(1); // second one is greater

        //letter control
        if (letter1 >= letter2) {
            System.out.println("Your account number is invalid!");

        }

        int primeNumber, counter = 0;
        //to get from account number the letter for controlling
        primeNumber = Integer.parseInt(accountNumber.substring(2, 4));
        //primes control
        for (int h = 1; h <= primeNumber; h++) {
            if (primeNumber % h == 0) {
                //primitive number can divided by himself and 1
                counter = counter + 1;
            }
        }
        if (counter != 2)//if counter is equals to  2 it is prime

        {
            System.out.println("Your account number is Invalid!");

        }
        //Step 3
        String lastNumbers = accountNumber.substring(4, accountNumber.length());
        int sum1 = 0, sum2 = 0, temp3 = 0,total =0;
        String deneme = "";

        //there is a loop to control is it version of multiplication greater than 10
        for (int f = 0; f < 12; f = f + 2) {
            if (Integer.parseInt(String.valueOf(lastNumbers.charAt(f))) * 2 < 10) //check is it greate than 10
            {
                sum1 = sum1 + Integer.parseInt(String.valueOf(lastNumbers.charAt(f))) * 2; //sum if it is not greater than 10
            } else {
                temp3 = Integer.parseInt(String.valueOf(lastNumbers.charAt(f))) * 2; // if it is greater than 10 smash and collect
                deneme = String.valueOf(temp3); // for taking   2 digit
                sum1 = sum1 + Integer.parseInt(String.valueOf(deneme.charAt(0))) + Integer.parseInt(String.valueOf(deneme.charAt(1))); //adding 2 digit
            }
        }
        //sum loop for other numbers
        for (int g = 1; g < 12; g= g + 2) {

            sum2 = sum2 + Integer.parseInt(String.valueOf(lastNumbers.charAt(g)));

        }
        //sum
        total = sum1 + sum2;
        if(total%10 == 0){
            System.out.println("Account number is valid!");
        }
        else {
            System.out.println("Account number is invalid");

        }
    }

}

