package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a+b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if(a>b){
            return a;
        }
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if(n==0){
            return 1;
        }
        else if(n>=0){
            return n*factorial(n-1);
        }
        return -1;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        StringBuilder newString = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            newString.append(input.charAt(i));
        }
        return newString.toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        int divisors=0;
        for(int i = 1; i<=number; i++){
            if(number%i==0){
                divisors++;
            }
        }
        return (divisors <= 2);
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int aux= array[0];
        for(int i=0; i<(array.length); i++){
            if(array[i]<aux){
                aux= array[i];
            }
        }
        return aux;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum= 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        //(x °C × 9/5) + 32 = y °F
        return celsius*1.8+32;

    }
}
