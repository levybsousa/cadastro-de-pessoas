package cadastro.pessoas.controller;

import cadastro.pessoas.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/emails")
@RestController
@RequiredArgsConstructor
public class EmailController {

    final private EmailService emailService;

}
