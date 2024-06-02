package org.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordCheckerTest {

    @Test
    void shouldReturnTrueForComplexPasswordWithDigitsAndSpecialChars() {
        assertTrue(PasswordChecker.checkPasswordComplexity("Password123!"));
    }

    @Test
    void shouldReturnTrueForComplexPasswordWithDigitsAndSpecialCharsAndVeryLong() {
        assertTrue(PasswordChecker.checkPasswordComplexity("Pasword123!Pasword123!Pasword123!Pasword123!Pasword123!Pasword123!"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlyNumbers() {
        assertFalse(PasswordChecker.checkPasswordComplexity("11112222"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlySpecialChars() {
        assertFalse(PasswordChecker.checkPasswordComplexity("!@#$%^&&"));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsOnlyLetters() {
        assertFalse(PasswordChecker.checkPasswordComplexity("AsSsCcVv"));
    }

    @Test
    void shouldReturnFalseIfPasswordLessEightCharacters() {
        assertFalse(PasswordChecker.checkPasswordComplexity("A1@"));
    }

    @Test
    void shouldReturnFalseIfPasswordIsEmpty() {
        assertFalse(PasswordChecker.checkPasswordComplexity(""));
    }

    @Test
    void shouldReturnFalseIfPasswordContainsSomeSpace() {
        assertFalse(PasswordChecker.checkPasswordComplexity("   "));
    }
}
