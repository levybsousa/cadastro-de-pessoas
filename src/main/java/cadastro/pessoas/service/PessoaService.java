package cadastro.pessoas.service;


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

    public List<Pessoa> getAll(){
        List<Pessoa> result= pessoaRepository.findAll();
        return result;
    }
    public Pessoa getById(Long id) throws Exception {
        Optional<Pessoa> result= pessoaRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else {
            throw new Exception("Pessoa não encontrada");
        }
        }
    }
    public Pessoa save(Pessoa pessoa){
        Optional<Pessoa> PessoaFromDataBase = pessoaRepository.getPessoaByNome(pessoa.getNome());

        if (PessoaFromDataBase.isPresent()) {
            throw new RecursoNaoEncontradoException();
        }
        Pessoa result = pessoaRepository.save(pessoa);
        return result;
    }
    public Pessoa update(Long id , Pessoa pessoa){
    this.getById(id);
        Optional<Pessoa> PessoaFromDataBase = pessoaRepository.getPessoaByNome(pessoa.getNome());


        Pessoa result = pessoaRepository.save(pessoa);
        return result;
}
public void delete(Long id){
    getById();
    pessoaRepository.deleteById(id);

}
