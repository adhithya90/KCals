import ProjectConfig.compileSdk

apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation" (project(Modules.core))
}

