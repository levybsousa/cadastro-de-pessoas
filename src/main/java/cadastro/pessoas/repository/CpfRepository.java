package cadastro.pessoas.repository;

import cadastro.pessoas.model.entity.Cpf;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CpfRepository extends jpaRepository<Cpf , Long>{

    Optional<Cpf> getFilmeByNumero(String numero);
}
