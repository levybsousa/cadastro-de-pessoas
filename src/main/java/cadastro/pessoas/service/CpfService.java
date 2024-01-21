package cadastro.pessoas.service;

import cadastro.pessoas.model.entity.Cpf;
import cadastro.pessoas.repository.CpfRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CpfService {

    private final CpfRepository cpfRepository;
    public List<Cpf> getAll(){
        List<Cpf> result = cpfRespository.findAll();
        return result;
    }
    public Cpf getById(Long id) throws Exception {
        Optional<Cpf> result = cpfRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new Exception("Filme não encontrado");
        }
    }

    public Cpf save(Cpf cpf) throws Exception {

        Optional<Cpf> filmeFromDataBase = cpfRepository.getFilmeByNumero(cpf.getNumero());

        if (filmeFromDataBase.isPresent()) {
            throw new Exception();
        }
        Cpf result = cpfRepository.save(cpf);
        return result;
    }
    public Cpf update(Long id, Cpf cpf) throws Exception {
        this.getById(id);

        Optional<Cpf> cpfFromDataBase = cpfRepository.getFilmeByTitulo(cpf.getNumero());

        if (cpfFromDataBase.isPresent() && cpfFromDataBase.get().getId() != cpf.getId()) {
            throw new Exception("Filme já cadastrado");
        }

        Cpf result = cpfRepository.save(cpf);
        return result;
    }
    public void delete(Long id) {
        getById(id);
        cpfRepository.deleteById(id);
    }

}
