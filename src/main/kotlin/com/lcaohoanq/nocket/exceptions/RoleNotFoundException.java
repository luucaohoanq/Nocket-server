package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataNotFoundException;

public class RoleNotFoundException extends DataNotFoundException {

    public RoleNotFoundException(String message) {
        super(message);
    }

}
