package br.com.rodrigobraz.OrderSystemKotlin.services

import br.com.rodrigobraz.OrderSystemKotlin.model.Category
import br.com.rodrigobraz.OrderSystemKotlin.repositories.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoryRepository) {

    fun create(category: Category): Category {
        return repository.save(category)
    }

    fun findById(id: Int): Category? {

        return repository.findById(id).orElseThrow()
    }


}
