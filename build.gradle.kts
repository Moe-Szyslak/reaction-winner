import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "me.ddivad"
version = Versions.BOT
description = "discordKt starter template"

plugins {
    kotlin("jvm") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("me.jakejmattson:DiscordKt:${Versions.DISCORDKT}")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    shadowJar {
        archiveFileName.set("Starter.jar")
        manifest {
            attributes(
                    "Main-Class" to "me.ddivad.starter.MainKt"
            )
        }
    }
}


object Versions {
    const val BOT = "1.0.0"
    const val DISCORDKT = "0.21.0"
}