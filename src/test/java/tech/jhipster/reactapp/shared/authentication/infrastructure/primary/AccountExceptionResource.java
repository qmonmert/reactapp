package tech.jhipster.reactapp.shared.authentication.infrastructure.primary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jhipster.reactapp.shared.authentication.application.NotAuthenticatedUserException;
import tech.jhipster.reactapp.shared.authentication.application.UnknownAuthenticationException;

@RestController
@RequestMapping("/api/account-exceptions")
class AccountExceptionResource {

  @GetMapping("/not-authenticated")
  public void notAuthenticatedUser() {
    throw new NotAuthenticatedUserException();
  }

  @GetMapping("/unknown-authentication")
  public void unknownAuthentication() {
    throw new UnknownAuthenticationException();
  }
}
