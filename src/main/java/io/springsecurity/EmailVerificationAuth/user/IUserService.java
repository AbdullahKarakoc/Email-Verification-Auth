package io.springsecurity.EmailVerificationAuth.user;

import io.springsecurity.EmailVerificationAuth.registration.RegistrationRequest;
import io.springsecurity.EmailVerificationAuth.registration.token.VerificationToken;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);
}


