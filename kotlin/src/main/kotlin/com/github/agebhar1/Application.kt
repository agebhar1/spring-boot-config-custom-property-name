package com.github.agebhar1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.bind.Name
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(MyConfig::class)
class Application

@ConfigurationProperties("application")
@ConstructorBinding
data class MyConfig(@Name("import") val importValue: String)

fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
