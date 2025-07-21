package com.example.booklibrary

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @field:NotBlank(message = "Title is mandatory")
    val title: String = "",

    @field:NotBlank(message = "Author is mandatory")
    val author: String = ""
)
