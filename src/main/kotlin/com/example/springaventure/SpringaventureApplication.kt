package com.example.springaventure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringaventureApplication

fun main(args: Array<String>) {
    runApplication<SpringaventureApplication>(*args)
}
