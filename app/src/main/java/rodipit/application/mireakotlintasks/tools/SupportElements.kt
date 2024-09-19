package rodipit.application.mireakotlintasks.tools

import rodipit.application.mireakotlintasks.presentation.ui.NavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.Camera

object SupportElements {

    val itemsBottomBar = listOf(
        NavigationItem(
            title = "Photo",
            selectedIcon = Icons.Filled.Camera,
            unselectedIcon = Icons.Outlined.Camera,
            destination = Destination.CameraScreen
        ),
        NavigationItem(
            title = "Dates",
            selectedIcon = Icons.Filled.CalendarMonth,
            unselectedIcon = Icons.Outlined.CalendarMonth,
            destination = Destination.DatesScreen
        ),
    )

    val itemsDrawer = listOf(
        NavigationItem(
            title = "Photo",
            selectedIcon = Icons.Filled.Camera,
            unselectedIcon = Icons.Outlined.Camera,
            destination = Destination.CameraScreen
        ),
        NavigationItem(
            title = "Dates",
            selectedIcon = Icons.Filled.CalendarMonth,
            unselectedIcon = Icons.Outlined.CalendarMonth,
            destination = Destination.DatesScreen
        ),
    )

}
