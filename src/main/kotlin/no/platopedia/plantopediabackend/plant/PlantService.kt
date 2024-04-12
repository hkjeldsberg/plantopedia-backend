package no.platopedia.plantopediabackend.plant

import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class PlantService(
    private val plantRepository: PlantRepository
) {
    internal fun getUsers() = plantRepository.findAll().toList()
}