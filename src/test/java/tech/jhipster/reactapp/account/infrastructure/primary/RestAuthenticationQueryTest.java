package tech.jhipster.reactapp.account.infrastructure.primary;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import tech.jhipster.reactapp.JsonHelper;
import tech.jhipster.reactapp.UnitTest;

@UnitTest
class RestAuthenticationQueryTest {

  @Test
  void shouldDeserializeFromJson() {
    RestAuthenticationQuery query = JsonHelper.readFromJson(json(), RestAuthenticationQuery.class);

    assertThat(query.authenticationToken()).isEqualTo(new UsernamePasswordAuthenticationToken("user", "password"));
    assertThat(query.isRememberMe()).isTrue();
  }

  private String json() {
    return """
    {
      "username": "user",
      "password": "password",
      "rememberMe": true
    }
    """;
  }
}
