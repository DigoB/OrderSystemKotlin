package br.com.rodrigobraz.OrderSystemKotlin

import br.com.rodrigobraz.OrderSystemKotlin.model.Category
import br.com.rodrigobraz.OrderSystemKotlin.repositories.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.Arrays

@SpringBootApplication
class OrderSystemKotlinApplication : CommandLineRunner {

	@Autowired
	private val categoryRepository: CategoryRepository? = null

	override fun run(vararg args: String?) {

		val cat1 = Category("Informática")
		val cat2 = Category("Escritório")
		categoryRepository!!.saveAll(listOf(cat1, cat2))


	}
}

fun main(args: Array<String>) {
	runApplication<OrderSystemKotlinApplication>(*args)
}
