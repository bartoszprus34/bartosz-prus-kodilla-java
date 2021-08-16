package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite{

    @Test
    void testProbablyIWillThrowExceptionTestSuite() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.51));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.4, 1.3));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 2));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.51));
    }
}
