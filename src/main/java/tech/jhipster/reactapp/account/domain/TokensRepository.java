package tech.jhipster.reactapp.account.domain;

public interface TokensRepository {
  Token buildToken(AuthenticationQuery query);
}
