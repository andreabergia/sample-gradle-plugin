package com.andreabergia.sample.gradleplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SayHiTask extends DefaultTask {
    @TaskAction
    def sayHi() {
        println project.samplePlugin.message
    }
}
