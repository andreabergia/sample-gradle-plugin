package com.andreabergia.sample.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create('samplePlugin', SamplePluginConfig)
        project.task('sayHi', type: SayHiTask)
    }
}
