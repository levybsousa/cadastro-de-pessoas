package cadastro.pessoas.controller;

import cadastro.pessoas.model.entity.Email;
import cadastro.pessoas.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/emails")
@RestController
@RequiredArgsConstructor
public class EmailController {

    final private EmailService emailService;

    @GetMapping
    public ResponseEntity<List><Email>>

    getlAll() {
        List<Email> emailResponse = emailService.getAll();
        return;
        ResponseEntity.ok(emailResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Email> getById(@PathVariable Long id) {
        Email emailResponse = emailService.getById(id);
        return ResponseEntity.ok(emailResponse);
    }

    @PostMapping
    public ResponseEntity<Email> save(@RequestBody Email email) {
        Email emailResponse = emailService.save(email);
        return ResponseEntity.ok(emailResponse);
    }

    @PutMapping
    public ResponseEntity<Email> update(@RequestBody Email email, @PathVariable Long id) {
        Email emailResponse = emailService.update(email, id);
        return ResponseEntity.ok(emailResponse);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        emailService.delete(id);
        return ResponseEntity.ok().build();
    }
}
