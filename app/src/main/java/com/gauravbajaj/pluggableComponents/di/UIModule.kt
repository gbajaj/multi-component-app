package com.gauravbajaj.pluggableComponents.di


import com.gauravbajaj.pluggableComponents.ui.components.FooterComponent
import com.gauravbajaj.pluggableComponents.ui.components.HeaderComponent
import com.gauravbajaj.pluggableComponents.ui.components.NewsComponent
import com.gauravbajaj.pluggableComponents.ui.components.ProfileComponent
import com.gauravbajaj.pluggableComponents.ui.components.StatsComponent
import com.gauravbajaj.pluggableComponents.ui.components.UIComponent
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class ComponentKey(val value: Int)

@Module
@InstallIn(SingletonComponent::class)
abstract class UIModule {

    @Binds
    @IntoMap
    @ComponentKey(1)
    abstract fun bindHeaderComponent(component: HeaderComponent): UIComponent

    @Binds
    @IntoMap
    @ComponentKey(2)
    abstract fun bindProfileComponent(component: ProfileComponent): UIComponent

    @Binds
    @IntoMap
    @ComponentKey(3)
    abstract fun bindStatsComponent(component: StatsComponent): UIComponent

    @Binds
    @IntoMap
    @ComponentKey(4)
    abstract fun bindNewsComponent(component: NewsComponent): UIComponent

    @Binds
    @IntoMap
    @ComponentKey(5)
    abstract fun bindFooterComponent(component: FooterComponent): UIComponent
}