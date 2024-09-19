package rodipit.application.mireakotlintasks.presentation.ui

import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.io.File

@Composable
fun DatesScreen(
    context: Context,
){
    val dates = remember {
        readDatesFromStorage(context)
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        itemsIndexed(dates) {index, item ->
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "Photo $index: $item"
            )
        }
    }
}

fun readDatesFromStorage(context: Context): List<String> {
    val directory = File(context.filesDir, "photos")
    val file = File(directory, "date.txt")
    val dates = mutableListOf<String>()

    if (file.exists()) {
        file.forEachLine { line ->
            dates.add(line)
        }
    }
    return dates
}
