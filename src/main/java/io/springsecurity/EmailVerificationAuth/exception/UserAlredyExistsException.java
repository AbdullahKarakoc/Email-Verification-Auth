package io.springsecurity.EmailVerificationAuth.exception;

public class UserAlredyExistsException extends RuntimeException {
    public UserAlredyExistsException(String message) {
        super(message);
    }
}
