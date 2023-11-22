package bg.softuni.errors.web;

import bg.softuni.errors.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalNotFoundExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ObjectNotFoundException.class)
    public ModelAndView handleNotFound(ObjectNotFoundException exception) {
        ModelAndView modelAndView = new ModelAndView("notfound-global");
        modelAndView.addObject("id", exception.getId());
        return modelAndView;
    }
}
