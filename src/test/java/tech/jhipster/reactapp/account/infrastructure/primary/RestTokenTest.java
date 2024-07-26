package tech.jhipster.reactapp.account.infrastructure.primary;

import static org.assertj.core.api.Assertions.*;
import static tech.jhipster.reactapp.account.domain.TokensFixture.*;

import org.junit.jupiter.api.Test;
import tech.jhipster.reactapp.JsonHelper;
import tech.jhipster.reactapp.UnitTest;

@UnitTest
class RestTokenTest {

  @Test
  void shouldConvertFromDomain() {
    assertThat(JsonHelper.writeAsString(RestToken.from(token()))).isEqualTo(json());
  }

  private String json() {
    return "{\"id_token\":\"token\"}";
  }
}
