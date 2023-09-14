package springsecurity.demo.authservice.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class APIExceptionPayload {
    private final String message;
    private final HttpStatus httpStatus;
    private final LocalDateTime dateTime;
    // if you need to return the full cause of the error to the client end
    //private final Throwable errorDetails;
}
