package no.platopedia.plantopediabackend.plant

import no.platopedia.plantopediabackend.plant.model.Plant
import org.springframework.data.jpa.repository.JpaRepository


interface PlantRepository : JpaRepository<Plant, String> {
}