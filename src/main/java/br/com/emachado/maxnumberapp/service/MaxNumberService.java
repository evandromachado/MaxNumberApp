package br.com.emachado.maxnumberapp.service;

import br.com.emachado.maxnumberapp.EmptyListException;
import br.com.emachado.maxnumberapp.dto.MaxNumberRequest;
import br.com.emachado.maxnumberapp.dto.MaxNumberResponse;

/**
 *
 * @author Evandro
 */
public interface MaxNumberService {
    MaxNumberResponse getMaxNumber(MaxNumberRequest request) throws EmptyListException;
}
