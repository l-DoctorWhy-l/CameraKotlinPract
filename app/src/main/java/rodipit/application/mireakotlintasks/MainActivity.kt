package rodipit.application.mireakotlintasks

import rodipit.application.mireakotlintasks.presentation.ui.MainScreen
import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!hasRequiredPermissions()) {
            ActivityCompat.requestPermissions(
                this,
                PERMISSIONS,
                0
            )
        }

        setContent {

            MainScreen(
                context = applicationContext
            )

        }
    }

    private fun hasRequiredPermissions(): Boolean {
        return PERMISSIONS.all {
            ContextCompat.checkSelfPermission(
                applicationContext,
                it
            ) == PackageManager.PERMISSION_GRANTED
        }
    }

    companion object {
        private val PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
    }

}

