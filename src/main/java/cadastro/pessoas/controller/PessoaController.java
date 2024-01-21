package cadastro.pessoas.controller;

import cadastro.pessoas.model.entity.Pessoa;
import cadastro.pessoas.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Pessoas")
@RestController
@RequiredArgsConstructor
public class PessoaController {

    private final PessoSer pessoaService;

    @GetMapping
    public ResponseEntity<List><Pessoa>> getAll() {
        List<Pessoa> pessoaResponse = pessoaService.gettAll();
        return ResponseEntity.ok(pessoaResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaController> getById(@PathVariable long id) {
        Pessoa pessoaResponse = pessoaService.getById(id);
        return ResponseEntity.ok(pessoaResponse);
    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        Pessoa pessoaResponse = pessoaService.update(id, pessoa);
        return ResponseEntity.ok(pessoaResponse);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        Pessoa pessoaResponse = pessoaService.update(id ,pessoa);
        return ResponseEntity.ok(pessoaResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
    pessoaService.delete(id);
    return ResponseEntity.ok().build();
    }

