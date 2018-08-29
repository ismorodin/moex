package ru.moex.moexapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestOperations

@SpringBootApplication
/**
 * @link http://iss.moex.com/iss/reference/
 */
class MoexApiApplication {

    @Bean
    fun restOperations(): RestOperations {
        return RestTemplateBuilder()
                .setConnectTimeout(30)
                .build()
    }
}

fun main(args: Array<String>) {
    runApplication<MoexApiApplication>(*args)
}
