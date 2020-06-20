package com.sharran.spring.demo.domain.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Country(): Serializable {
    @Id
    @GeneratedValue
    var id: Int? = null
    @Column
    var name: String? = null
    @Column
    var nameCode: String? = null
    @Column
    var phoneCode: String? = null
}