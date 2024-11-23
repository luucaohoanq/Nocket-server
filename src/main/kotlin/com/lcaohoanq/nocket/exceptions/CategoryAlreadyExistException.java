package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataAlreadyExistException;

public class CategoryAlreadyExistException extends DataAlreadyExistException {

    public CategoryAlreadyExistException(String message) {
        super(message);
    }

}
