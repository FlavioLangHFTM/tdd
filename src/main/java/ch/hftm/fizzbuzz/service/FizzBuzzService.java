package ch.hftm.fizzbuzz.service;

public class FizzBuzzService {

    public String getResultOfNumber(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }

        if (i % 5 == 0) {
            result += "Buzz";
        }

        if (result.length() == 0) {
            result = Integer.toString(i);
        }

        return result;
    }

}
