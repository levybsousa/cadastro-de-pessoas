package cadastro.pessoas.service;

import cadastro.pessoas.exception.NegocioException;
import cadastro.pessoas.exception.RecursoNaoEncontradoException;
import cadastro.pessoas.model.entity.Pessoa;
import cadastro.pessoas.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public List<Pessoa> getAll() {
        List<Pessoa> result = pessoaRepository.findAll();
        return result;
    }

    public Pessoa getById(Long id) {
        Optional<Pessoa> result = pessoaRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RecursoNaoEncontradoException("Pessoa não cadastrada");
        }
    }

    public Pessoa save(Pessoa pessoa) {
        Optional<Pessoa> pessoaFromDataBase = pessoaRepository.getPessoaByNome(pessoa.getNome());
        if (pessoaFromDataBase.isPresent()) {
            throw new NegocioException();
        }
        Pessoa result = pessoaRepository.save(pessoa);
        return result;
    }

    public Pessoa update(Long id, Pessoa pessoa) {
        this.getById(id);

        Optional<Pessoa> pessoaFromDataBase = pessoaRepository.getPessoaByNome(pessoa.getNome());

        if (pessoaFromDataBase.isPresent() && pessoaFromDataBase.get().getId() != pessoa.getId()) {
            throw new NegocioException("Pessoa já cadastrada");
        }
        Pessoa result = pessoaRepository.save(pessoa);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        pessoaRepository.deleteById(id);
    }
}
