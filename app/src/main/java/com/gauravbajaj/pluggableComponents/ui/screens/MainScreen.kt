package com.gauravbajaj.pluggableComponents.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gauravbajaj.pluggableComponents.ui.viewmodel.MainViewModel


@Composable
fun MainScreen(viewModel: MainViewModel) {
    val enabledComponents by viewModel.enabledComponents
    val allComponents = remember { viewModel.getOrderedComponents() }
    val enabledOrderedComponents = remember(enabledComponents) {
        viewModel.getEnabledOrderedComponents()
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Component Toggle Section
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Toggle Components",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(allComponents) { component ->
                        FilterChip(
                            onClick = { viewModel.toggleComponent(component.name) },
                            label = { Text(component.name) },
                            selected = component.name in enabledComponents
                        )
                    }
                }
            }
        }

        // Components Display Section
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            items(
                items = enabledOrderedComponents,
                key = { it.name }
            ) { component ->
                component.Content()
            }
        }
    }
}