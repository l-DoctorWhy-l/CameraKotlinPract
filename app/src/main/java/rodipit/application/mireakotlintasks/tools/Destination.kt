package rodipit.application.mireakotlintasks.tools

import kotlinx.serialization.Serializable

sealed class Destination {


    @Serializable
    data object CameraScreen : Destination()

    @Serializable
    data object DatesScreen: Destination()
}
