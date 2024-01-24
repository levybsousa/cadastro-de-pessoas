package cadastro.pessoas.exception;

public class NegocioException extends RuntimeException {
    public NegocioException() {
        super("Pessoa já cadastrada");
    }

    public NegocioException(String mensagem) {
        super(mensagem);
    }
}
