package tech.jhipster.reactapp.shared.authentication.infrastructure.primary;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tech.jhipster.reactapp.shared.authentication.application.NotAuthenticatedUserException;
import tech.jhipster.reactapp.shared.authentication.application.UnknownAuthenticationException;

@ControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE - 20_000)
class AuthenticationExceptionAdvice {

  private static final String MESSAGE_KEY = "message";

  @ExceptionHandler(NotAuthenticatedUserException.class)
  public ProblemDetail handleNotAuthenticateUser(NotAuthenticatedUserException ex) {
    ProblemDetail detail = ProblemDetail.forStatus(HttpStatus.UNAUTHORIZED);
    detail.setTitle("not authenticated");
    detail.setProperty(MESSAGE_KEY, "error.http.401");

    return detail;
  }

  @ExceptionHandler(UnknownAuthenticationException.class)
  public ProblemDetail handleUnknownAuthentication(UnknownAuthenticationException ex) {
    ProblemDetail detail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    detail.setTitle("unknown authentication");
    detail.setProperty(MESSAGE_KEY, "error.http.500");

    return detail;
  }
}
