package br.com.rodrigobraz.OrderSystemKotlin.resources

import br.com.rodrigobraz.OrderSystemKotlin.model.Category
import br.com.rodrigobraz.OrderSystemKotlin.repositories.CategoryRepository
import br.com.rodrigobraz.OrderSystemKotlin.services.CategoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/categories")
class CategoryController(private val service: CategoryService) {

    @PostMapping
    fun createCategory(@RequestBody category: Category) : ResponseEntity<Category> {
        return ResponseEntity.ok(service.create(category))
    }

    @GetMapping("/{id}")
    fun findCategoryById(@PathVariable id: Int) : ResponseEntity<Category> {
        return ResponseEntity.ok(service.findById(id))
    }
}