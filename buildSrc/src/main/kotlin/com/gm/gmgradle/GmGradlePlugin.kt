package com.gm.gmgradle

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * Author     : Gowtham
 * Email      : goutham.gm11@gmail.com
 * Github     : https://github.com/goutham106
 * Created on : 2019-09-18.
 */
open class GmGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {

        val gmGradleExtension: GmGradleExtension = project.extensions.create(
            "gmExt", GmGradleExtension::class.java
        )

        project.configureAndroid(gmGradleExtension)
        project.configureDependencies()
    }

}