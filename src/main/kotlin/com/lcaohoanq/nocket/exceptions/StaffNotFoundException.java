package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataNotFoundException;

public class StaffNotFoundException extends DataNotFoundException {

    public StaffNotFoundException(String message) {
        super(message);
    }

}
