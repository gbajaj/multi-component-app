package com.gauravbajaj.pluggableComponents

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Custom [Application] class for the InterviewReady application.
 *
 * This class is annotated with `@HiltAndroidApp` to enable Hilt dependency injection
 * throughout the application.
 */
@HiltAndroidApp
class MyApplication : Application()
