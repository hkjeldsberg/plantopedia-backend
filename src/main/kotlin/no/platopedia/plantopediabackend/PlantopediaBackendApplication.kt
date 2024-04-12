package no.platopedia.plantopediabackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlantopediaBackendApplication

fun main(args: Array<String>) {
    runApplication<PlantopediaBackendApplication>(*args)
}
