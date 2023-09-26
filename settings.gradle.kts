pluginManagement {
    repositories {
        google()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

rootProject.name = "snapshot-poc"
include(":app")
include(":testsnapshot")
