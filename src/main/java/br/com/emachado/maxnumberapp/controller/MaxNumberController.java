package br.com.emachado.maxnumberapp.controller;

import br.com.emachado.maxnumberapp.EmptyListException;
import br.com.emachado.maxnumberapp.dto.MaxNumberRequest;
import br.com.emachado.maxnumberapp.dto.MaxNumberResponse;
import br.com.emachado.maxnumberapp.service.MaxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author Evandro
 */
@RestController
public class MaxNumberController {
    
  @Autowired
  private MaxNumberService service;
  
  @PostMapping("/maxNumber")
  public MaxNumberResponse getMaxNumber(@RequestBody MaxNumberRequest request) throws EmptyListException{
    return service.getMaxNumber(request);
  }
}
