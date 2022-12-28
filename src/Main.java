import java.util.Scanner;

public class Main {
    /*Examine a valid account number.
     Write a program that prompts the user to enter an account number.
 Display  whether the number  is valid or invalid according to the following situations.
Account numbers follow certain patterns.
1)An  account  number  must  have  16  characters.
 It  must start  with  two  capital  letters  but  the first letter must always be lower than the second.
(for example: AB, CH, AZ, etc.)2)Two digits after the letters must be prime numbers.
3)For the next 12 digits:
a)Double  every  second  digit  from  right  to  left.
If  doubling  of  a  digit  results  in  a  two-digit number, add up the two digits to get a single-digit number
.b)Now add all single-digit numbers from Step a.4 + 4 + 8 + 2 + 3 + 1 = 22
c)Add all digits in the odd places from right to left in the card number.6 +6 + 0 + 8 + 0 + 7 = 27d
)Sum the results from Step b and Step c.22 + 27 = 49
e)If  the  result  from  Step  d  is  divisible  by  10,  the  account  number  is  valid;  otherwise,  it  is invalid.
For example: The account number AC11576018412626 is a valid.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number to check is it invalid or valid");
        String accountNumber = scan.nextLine();
        accountNumberControl.control(accountNumber);
    }
}