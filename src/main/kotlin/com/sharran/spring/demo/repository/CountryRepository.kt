package com.sharran.spring.demo.repository

import com.sharran.spring.demo.domain.entity.Country
import org.springframework.data.domain.Page
import org.springframework.data.repository.CrudRepository
import java.awt.print.Pageable

interface CountryRepository: CrudRepository<Country, Int> {
    fun findAll(pageable: org.springframework.data.domain.Pageable): Page<Country>
}