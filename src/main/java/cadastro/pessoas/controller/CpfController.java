package cadastro.pessoas.controller;

import cadastro.pessoas.model.entity.Cpf;
import cadastro.pessoas.service.CpfService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cpfs")
@RestController
@RequiredArgsConstructor
public class CpfController {

    private final CpfService cpfService;

    @GetMapping
    public ResponseEntity<List<Cpf>> getAll() {
        List<Cpf> filmeResponse = cpfService.getAll();
        return ResponseEntity.ok(filmeResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cpf> getAll(@PathVariable Long id) {
        Cpf cpfResponse = cpfService.getAll();
        return ResponseEntity.ok(cpfResponse);
    }
    @PostMapping
    public ResponseEntity<Cpf> save(@RequestBody Cpf cpf) {
        Cpf cpfResponse = cpfService.save(cpf);
        return ResponseEntity.ok(cpfResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cpf> update(@PathVariable Long id, @RequestBody Cpf filme) {
        Cpf cpfResponse = cpfService.update(id, filme);
        return ResponseEntity.ok(cpfResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cpfService.delete(id);
        return ResponseEntity.ok().build();
    }


}
