package com.sharran.spring.demo.domain.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class ErrorResponse{
    var errorCode: Int? = null
    var errorMessage: String? = null
}