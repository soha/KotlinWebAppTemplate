package com.example.spring.boot.KotlinWebAppTemplate

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class KotlinWebAppTemplateApplication

fun main(args: Array<String>) {
    runApplication<KotlinWebAppTemplateApplication>(*args)
}
