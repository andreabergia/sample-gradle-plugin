package com.andreabergia.sample.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin implements Plugin<Project> {
    void apply(Project project) {
        // Define a new task
        project.task('sample-task') << {
            println "Hello from our sample plugin!"
        }
    }
}