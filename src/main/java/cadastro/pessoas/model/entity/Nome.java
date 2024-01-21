package cadastro.pessoas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Nome {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nome_sequence")
    @SequenceGenerator(name = "nome_sequence", sequenceName = "nom_seq")

    private Long id;
    private String nome;
}
