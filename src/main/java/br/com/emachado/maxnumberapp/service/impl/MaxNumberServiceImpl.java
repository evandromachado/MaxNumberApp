package br.com.emachado.maxnumberapp.service.impl;

import br.com.emachado.maxnumberapp.EmptyListException;
import br.com.emachado.maxnumberapp.dto.MaxNumberRequest;
import br.com.emachado.maxnumberapp.dto.MaxNumberResponse;
import br.com.emachado.maxnumberapp.service.MaxNumberService;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Evandro
 */
@Service
public class MaxNumberServiceImpl implements MaxNumberService{

  @Override
  public MaxNumberResponse getMaxNumber(MaxNumberRequest request) throws EmptyListException{
    MaxNumberResponse response = new MaxNumberResponse();

    List<Number> list = request.getList();
    if (list == null)
      throw new EmptyListException("List cannot be null");
    if (list.size()==0)
      throw new EmptyListException("List cannot be empty");
    
    Number max = Collections.max(list, new Comparator<Number>() {
      @Override
      public int compare(Number o1, Number o2) {
        if (o1.doubleValue() == o2.doubleValue())
          return 0;
        else if (o1.doubleValue() > o2.doubleValue())
          return 1;
        else
          return -1;
      }
    });
    response.setMax(max);
    return response;
  }

}
