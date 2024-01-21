package cadastro.pessoas.repository;

import cadastro.pessoas.model.entity.Cpf;
import cadastro.pessoas.model.entity.Email;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailRepository extends jpaRepository<Email, Long> {

    Optional<Email> getEmailByNome(String nome);
}
