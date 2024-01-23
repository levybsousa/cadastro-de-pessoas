package cadastro.pessoas.controller;

import cadastro.pessoas.model.entity.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pessoas")
@RestController
@RequiredArgsConstructor
public class PessaController {

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAll() {
        return null;
    }

    @GetMapping
    public ResponseEntity<Pessoa> getById() {
        return null;
    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        return null;
    }

    @PutMapping
    public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return null;
    }
}
