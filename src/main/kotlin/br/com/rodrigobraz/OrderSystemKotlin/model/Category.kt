package br.com.rodrigobraz.OrderSystemKotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Category(
    val name: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null
}
