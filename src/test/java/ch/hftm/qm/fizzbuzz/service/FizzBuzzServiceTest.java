package ch.hftm.qm.fizzbuzz.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ch.hftm.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzServiceTest {

    @Test
    public void pruefeNormaleZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.getResultOfNumber(2);
        Assertions.assertEquals("2", result, "Normale Zahl als Resultaterwartet!");
    }

    @Test
    public void pruefeDurchDreiTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.getResultOfNumber(3);
        Assertions.assertEquals("Fizz", result, "Fizz als Resultat erwartet!");
    }

    @Test
    public void pruefeDurchFuenfTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.getResultOfNumber(5);
        Assertions.assertEquals("Buzz", result, "Buzz als Resultat erwartet!");
    }

    @Test
    public void pruefeDurchDreiUndFuenfTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        String result = fizzBuzzService.getResultOfNumber(15);
        Assertions.assertEquals("FizzBuzz", result, "FizzBuzz als Resultat erwartet!");
    }
}
