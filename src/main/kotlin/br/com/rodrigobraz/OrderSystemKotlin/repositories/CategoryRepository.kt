package br.com.rodrigobraz.OrderSystemKotlin.repositories

import br.com.rodrigobraz.OrderSystemKotlin.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category, Int> {

}
