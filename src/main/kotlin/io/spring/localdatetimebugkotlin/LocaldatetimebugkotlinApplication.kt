package io.spring.localdatetimebugkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@SpringBootApplication
class LocaldatetimebugkotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(LocaldatetimebugkotlinApplication::class.java, *args)
}

@RestController
class PersonController {

    @GetMapping("/person")
    fun showPerson(): Person {
        return Person("erik", LocalDateTime.now())
    }

}


data class Person(val name: String, val dateCreated: LocalDateTime)