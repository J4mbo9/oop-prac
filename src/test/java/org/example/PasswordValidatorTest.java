package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 요구사항
 * 1.테스트 코드 실습
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호 최소 8자 이상, 12자 이하일 경우 예외 발생 X")
    @Test
    void validatePasswordTest() {
        assertThatCode(()-> PasswordValidator.validate("serversimple"))
                .doesNotThrowAnyException(); //에러가 발생하지 않으면 true
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce","aabbccddeeffg"}) //단순히 값이 하나만 바뀔때는 ValueSource를 이용하면 쉽게 값을 바꿔가며 테스트가 가능
    @Test
    void validatePasswordTest2(String password) {

        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("비밀번호는 최소 8자 이상, 12자 이하여아 한다");
    }
}
