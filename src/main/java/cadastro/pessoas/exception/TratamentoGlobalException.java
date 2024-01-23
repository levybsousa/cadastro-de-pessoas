package cadastro.pessoas.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TratamentoGlobalException {
    @ExceptionHandler(value = {RuntimeException.class})
    private ResponseEntity<ExceptionDto> handleConflict(RecursoNaoEncontradoException exception, WebRequest request) {
        ExceptionDto responseDto = new ExceptionDto();
        responseDto.setMensagem(exception.getMessage());
        responseDto.setStatusCode(404L);
        return ResponseEntity.ok(responseDto);
    }
}
