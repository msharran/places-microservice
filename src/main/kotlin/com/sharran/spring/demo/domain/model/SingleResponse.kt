package com.sharran.spring.demo.domain.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import java.util.Optional

@JsonInclude(NON_NULL)
class SingleResponse<T>(optional: Optional<T>): ErrorResponse(){
    var data: T? = null

    init {
        if (optional.isPresent) {
            data = optional.get()
        } else {
            errorCode = 204
            errorMessage = "No Records Found"
        }
    }
}