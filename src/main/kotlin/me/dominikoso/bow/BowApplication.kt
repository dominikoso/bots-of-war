package me.dominikoso.bow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BowApplication

fun main(args: Array<String>) {
	runApplication<BowApplication>(*args)
}
