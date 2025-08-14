package com.gauravbajaj.pluggableComponents.ui.components

import androidx.compose.runtime.Composable

interface UIComponent {
    val name: String
    val order: Int

    @Composable
    fun Content()
}