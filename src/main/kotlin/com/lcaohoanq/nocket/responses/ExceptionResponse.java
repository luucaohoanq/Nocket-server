package com.lcaohoanq.nocket.responses;

import com.lcaohoanq.nocket.responses.base.BaseResponse;
import java.util.Map;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ExceptionResponse extends BaseResponse<Object> {

    private Map<String, Object> details;

}
