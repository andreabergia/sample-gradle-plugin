package com.andreabergia.sample.gradleplugin

class SamplePluginConfig {
    String message = "Hello from our plugin"

    def message(s) {
        message = s as String
    }
}
