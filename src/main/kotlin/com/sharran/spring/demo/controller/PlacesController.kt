package com.sharran.spring.demo.controller

import com.sharran.spring.demo.domain.entity.Country
import com.sharran.spring.demo.domain.model.SingleResponse
import com.sharran.spring.demo.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/places")
class PlacesController(@Autowired val countryRepository: CountryRepository) {

    @GetMapping("countries")
    fun countries(pageable: Pageable): Page<Country> {
        val countries = countryRepository.findAll(pageable)
        return PageImpl(countries.content, pageable, countries.totalPages.toLong())
    }

    @GetMapping("countries/{id}")
    fun country(@PathVariable id: Int): SingleResponse<Country> {
        val country = countryRepository.findById(id)
        return SingleResponse(country)
    }
}