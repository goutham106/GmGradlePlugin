package com.gm.gmgradle

import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project

/**
 * Author     : Gowtham
 * Email      : goutham.gm11@gmail.com
 * Github     : https://github.com/goutham106
 * Created on : 2019-09-18.
 */

const val jUnit = "junit:junit:4.12"
const val androidTestRunner = "com.android.support.test:runner:1.0.2"
const val androidTestRules = "com.android.support.test:rules:1.0.2"
const val mockkAndroid = "io.mockk:mockk-android:1.9"
const val mockk = "io.mockk:mockk:1.9"
const val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.2"

internal fun Project.configureDependencies() = dependencies.apply{
    add("testImplementation", jUnit)

    if (project.containsAndroidPlugin()) {
        add("androidTestImplementation", androidTestRunner)
        add("androidTestImplementation", androidTestRules)
        add("androidTestImplementation", espressoCore)
    }
}

internal fun Project.containsAndroidPlugin(): Boolean {
    return project.plugins.toList().any { plugin -> plugin is AndroidBasePlugin }
}