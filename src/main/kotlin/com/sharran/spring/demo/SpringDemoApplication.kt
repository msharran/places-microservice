package com.sharran.spring.demo

import com.sharran.spring.demo.util.log
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDemoApplication: CommandLineRunner {
    override fun run(vararg args: String?) {
        "Inject Data into db".log()
    }
}

fun main(args: Array<String>) {
    runApplication<SpringDemoApplication>(*args)
}
