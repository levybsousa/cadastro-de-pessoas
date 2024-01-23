package cadastro.pessoas.exception;

public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException() {
        super("Pessoa não encontrada");
    }

    public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
