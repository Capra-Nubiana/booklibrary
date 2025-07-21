package com.example.booklibrary

import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/books")
class BookController(private val repository: BookRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun create(@Valid @RequestBody book: Book) = repository.save(book)

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Book = repository.findById(id).orElseThrow {
        ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found")
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody updatedBook: Book): Book {
        return repository.findById(id).map {
            repository.save(it.copy(title = updatedBook.title, author = updatedBook.author))
        }.orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found")
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = repository.deleteById(id)
}
