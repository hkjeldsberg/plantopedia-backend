package no.platopedia.plantopediabackend.plant

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/plants")
class PlantController(private val plantService: PlantService) {

    @GetMapping
    fun getPlants() = plantService.getUsers().map { it.toPlantResponse() }
}

