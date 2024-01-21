package cadastro.pessoas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cpf {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cpf_sequence")
    @SequenceGenerator(name = "cpf_sequence", sequenceName = "cpf_seq")

    private Long id;
    private String numero;
}
