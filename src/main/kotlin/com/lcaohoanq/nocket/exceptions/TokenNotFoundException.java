package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataNotFoundException;

public class TokenNotFoundException extends DataNotFoundException {

    public TokenNotFoundException(String message) {
        super(message);
    }

}
