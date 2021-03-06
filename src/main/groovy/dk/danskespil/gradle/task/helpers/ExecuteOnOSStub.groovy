package dk.danskespil.gradle.task.helpers

import org.gradle.api.DefaultTask
import org.gradle.api.Project

class ExecuteOnOSStub extends GradleServiceExecuteOnOS {
    ExecuteOnOSStub(Project project) {
        super(project)
    }

    def executeExecSpec(DefaultTask task, Closure e) {
        task.commandLine.prefix 'echo'
        task.project.exec e
    }
}
