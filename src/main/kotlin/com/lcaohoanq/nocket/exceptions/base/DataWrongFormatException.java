package com.lcaohoanq.nocket.exceptions.base;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DataWrongFormatException extends RuntimeException{

    public DataWrongFormatException(String message) {
        super(message);
    }

}
