package springsecurity.demo.authservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class APIExceptionHandler {
    @ExceptionHandler(value = {APIException.class}) // this handler can be used to handle multiple exception also
    public ResponseEntity<Object> handleAPIException(APIException e) {
        HttpStatus BAD_REQUEST = HttpStatus.BAD_REQUEST;
        // create payload for response
        APIExceptionPayload responsePayload = new APIExceptionPayload(
                e.getMessage(),
                BAD_REQUEST,
                LocalDateTime.now()
                // to return full cause of exception
                //,e
        );

        // return the response
        return new ResponseEntity<>(responsePayload, BAD_REQUEST);
    }
}
