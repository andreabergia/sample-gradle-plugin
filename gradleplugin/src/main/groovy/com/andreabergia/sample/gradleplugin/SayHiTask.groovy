package com.andreabergia.sample.gradleplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SayHiTask extends DefaultTask {
    String message = "Hello from our task"

    @TaskAction
    def sayHi() {
        println message
    }
}
