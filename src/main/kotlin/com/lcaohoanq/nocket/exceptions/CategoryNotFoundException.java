package com.lcaohoanq.nocket.exceptions;

import com.lcaohoanq.nocket.exceptions.base.DataNotFoundException;

public class CategoryNotFoundException extends DataNotFoundException {

    public CategoryNotFoundException(String message) {
        super(message);
    }

}
