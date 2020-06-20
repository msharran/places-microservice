package com.sharran.spring.demo.domain.model

class ListResponse<T>(val data: Iterable<T>){
    val totalCount = data.count()
}

