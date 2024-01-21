package cadastro.pessoas.service;

import cadastro.pessoas.model.entity.Email;
import cadastro.pessoas.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final EmailRepository emailRepository;

    public List<Email> getAll() {
        List<Email> result = emailRepository.findAll();
        return result;
    }

    public Email getById(Long id) throws Exception {
        Optional<Email> result = emailRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new Exception("Email não encontrado");
        }

    }

    public Email save(Email email) throws Exception {
        Optional<Email> emailFromDataBase = emailRepository.getEmailByNome(email.getNome());
        if (emailFromDataBase.isPresent()) {
            throw new Exception();
        }
        Email result = emailRepository.save();
        return result;
    }

    public Email update(Long id, Email email) throws Exception {
        this.getById(id);
        Optional<Email> emailFromDataBase = emailRepository.getEmailByNome(email.getNome());
        if (emailFromDataBase.isPresent() && emailFromDataBase.get().getId() != email.getId()) {
            throw new Exception("Filme já cadastrado");
        }
        Email result = emailRepository.save();
        return result;
    }
    public void delete(){
        getById(id);
        emailRepository.deleteById(id);
    }
}
