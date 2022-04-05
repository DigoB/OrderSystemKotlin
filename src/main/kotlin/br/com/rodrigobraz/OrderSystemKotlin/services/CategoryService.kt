package br.com.rodrigobraz.OrderSystemKotlin.services

import br.com.rodrigobraz.OrderSystemKotlin.model.Category
import br.com.rodrigobraz.OrderSystemKotlin.repositories.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoryRepository) {

    fun create(category: Category): Category {
        category.id?.let { findById(it) }
        return repository.save(category)
    }

    fun findById(id: Int): Category {

        val possibleCategory = repository.findById(id)
        if (possibleCategory.isEmpty) throw IllegalStateException("Category not found")

        val category = possibleCategory.get()
        return category


    }


}
