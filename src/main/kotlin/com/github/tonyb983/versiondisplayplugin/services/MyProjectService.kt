package com.github.tonyb983.versiondisplayplugin.services

import com.github.tonyb983.versiondisplayplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
