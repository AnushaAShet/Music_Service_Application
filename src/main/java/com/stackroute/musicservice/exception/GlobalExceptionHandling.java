package com.stackroute.musicservice.exception;
import com.stackroute.musicservice.response.ResponseForError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class GlobalExceptionHandling {
    @ControllerAdvice
    public class TrackGlobalExceptionHandling extends ResponseEntityExceptionHandler {

        @ExceptionHandler(value = {TrackAlreadyExistsException.class})
        public ResponseEntity<ResponseForError> globalTrackAlreadyExistsException(TrackAlreadyExistsException ex) throws Exception{
            ResponseForError responseForError = new ResponseForError();
            responseForError.setErrorID(HttpStatus.BAD_REQUEST.value());
            responseForError.setErrorMessageInformation(ex.getMessage());
            return new ResponseEntity<>(responseForError,HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler(value = {TrackNotFoundException.class})
        public ResponseEntity<ResponseForError> globalTrackNotFoundException(TrackNotFoundException ex) throws Exception{
            ResponseForError responseForError = new ResponseForError();
            responseForError.setErrorID(HttpStatus.BAD_REQUEST.value());
            responseForError.setErrorMessageInformation(ex.getMessage());
            return new ResponseEntity<>(responseForError,HttpStatus.BAD_REQUEST);
        }
    }

}

