package com.gauravbajaj.pluggableComponents.ui.viewmodel


import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.gauravbajaj.pluggableComponents.ui.components.UIComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val uiComponents: Map<Int, @JvmSuppressWildcards UIComponent>
) : ViewModel() {

    private val _enabledComponents = mutableStateOf(
        uiComponents.values.map { it.name }.toSet()
    )
    val enabledComponents: State<Set<String>> = _enabledComponents

    fun toggleComponent(componentName: String) {
        val current = _enabledComponents.value.toMutableSet()
        if (componentName in current) {
            current.remove(componentName)
        } else {
            current.add(componentName)
        }
        _enabledComponents.value = current
    }

    fun getOrderedComponents(): List<UIComponent> {
        return uiComponents.toSortedMap().values.toList()
    }

    fun getEnabledOrderedComponents(): List<UIComponent> {
        return getOrderedComponents().filter { it.name in _enabledComponents.value }
    }
}