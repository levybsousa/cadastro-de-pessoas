package cadastro.pessoas.controller;

import cadastro.pessoas.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Pessoas")
@RestController
@RequiredArgsConstructor
public class Pessoa {

    private final PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List><Pessoa> getAll() {
        return;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getById(@PathVariable long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<void> delete(@PathVariable Long id) {
        return null;
    }
}
