package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataAlreadyExistException;

public class RoleAlreadyExistException extends DataAlreadyExistException {

    public RoleAlreadyExistException(String message) {
        super(message);
    }

}
