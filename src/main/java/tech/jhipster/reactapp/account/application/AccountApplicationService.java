package tech.jhipster.reactapp.account.application;

import org.springframework.stereotype.Service;
import tech.jhipster.reactapp.account.domain.AuthenticationQuery;
import tech.jhipster.reactapp.account.domain.Token;
import tech.jhipster.reactapp.account.domain.TokensRepository;

@Service
public class AccountApplicationService {

  private final TokensRepository tokens;

  public AccountApplicationService(TokensRepository tokens) {
    this.tokens = tokens;
  }

  public Token createToken(AuthenticationQuery query) {
    return tokens.buildToken(query);
  }
}
