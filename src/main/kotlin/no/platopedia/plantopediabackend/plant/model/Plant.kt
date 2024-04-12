package no.platopedia.plantopediabackend.plant.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "PLANT_TABLE")
class Plant(
    private val name: String,
    private val description: String,
) {
    @Id
    internal val id: String = "okasodk"

    internal fun toPlantResponse() = PlantResponse(id = id, name = name, description = description)
}
