package tech.jhipster.reactapp.account.infrastructure.primary;

import static org.assertj.core.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;
import tech.jhipster.reactapp.JsonHelper;
import tech.jhipster.reactapp.UnitTest;

@UnitTest
class RestAccountTest {

  @Test
  void shouldSerializeToJson() {
    assertThat(JsonHelper.writeAsString(new RestAccount("user", Set.of("ROLE_USER")))).isEqualTo(json());
  }

  private String json() {
    return """
    {\
    "login":"user",\
    "authorities":[\
    "ROLE_USER"\
    ]\
    }\
    """;
  }
}
