package cadastro.pessoas.repository;

import cadastro.pessoas.model.entity.Nome;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NomeRepository extends jpaRepository<Nome, Long> {

    Optional<Nome> getNomeByNome(String nome);
}
