package cadastro.pessoas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_sequence")
    @SequenceGenerator(name = "email_sequence", sequenceName = "ema_seq")

    private Long id;
    private String nome;
}
