# Account Number Validation Program

## Overview

This project involves a Java program designed to validate account numbers based on specific criteria. The program follows a set of rules to determine if an account number is valid or invalid, making use of string manipulation and basic arithmetic operations.

## Assignment Details

### Objective

Create a Java program that validates account numbers based on the following criteria:

1. **Format**:
   - The account number must be exactly 16 characters long.
   - It must start with two capital letters where the first letter must be less than the second one (e.g., AB, CH, AZ).

2. **Prime Number Check**:
   - The two digits following the letters must represent a prime number.

3. **Validation Algorithm**:
   - **Step 1**: Double every second digit from right to left in the remaining 12 digits of the account number.
     - If doubling results in a two-digit number, sum the digits of the result.
   - **Step 2**: Sum all the single-digit numbers obtained from Step 1.
   - **Step 3**: Add all the digits in the odd positions from right to left.
   - **Step 4**: Sum the results from Step 2 and Step 3.
   - **Step 5**: If the final sum is divisible by 10, the account number is valid; otherwise, it is invalid.

### Code Explanation

- **`accountNumberControl` Class**:
  - Contains a static method `control` that performs the validation.
  - Checks the format of the account number, performs prime number validation, and applies the Luhn algorithm to determine the validity.

- **`Main` Class**:
  - Prompts the user to input an account number.
  - Calls the `control` method to validate the provided account number and prints the result.

### Example

**Input**:
```
AC11576018412626
```

**Output**:
```
Account number is valid!
```

## Usage

1. Compile the Java files using:
   ```
   javac Main.java accountNumberControl.java
   ```
2. Run the program using:
   ```
   java Main
   ```
3. Enter a 16-character account number when prompted.

## Requirements

- Java 8 or later

## Notes

- Ensure that the account number entered meets the length and format criteria before validation.
- The program uses the Luhn algorithm for validating the account number's numerical section.
