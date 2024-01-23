package cadastro.pessoas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExceptionDto {
    private String mensagem;
    private Long statusCode;
}
